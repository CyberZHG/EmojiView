package zhaohg.emojiview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ImageView.ScaleType;

public class EmojiViewEx extends LinearLayout {
	
	private boolean isHidden = true;
	private boolean initialized = false;
	
	private EditText edit;
	private EmojiView[] emojiViews;
	private float currentCategory = EmojiCategory.PEOPLE;
	
	private int indicatorDotsColor = EmojiDefault.INDICATOR_DOTS_COLOR;
	private boolean showIndicatorDots = EmojiDefault.SHOW_INDICATOR_DOTS;
	private boolean autoHideSoftInput = EmojiDefault.AUTO_HIDE_SOFT_INPUT;
	private int rowNum = EmojiDefault.ROW_NUM;
	private int colNum = EmojiDefault.COL_NUM;
	
	private int borderColor = EmojiDefault.BORDER_COLOR;
	private int categoryHeight = EmojiDefault.CATEGORY_HEIGHT;
	
	private View[] borders;
	
	public EmojiViewEx(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.initView(attrs);
	}

	public void initView(AttributeSet attrs) {
		this.hide();
		if (attrs != null) {
			TypedArray values = this.getContext().obtainStyledAttributes(attrs, R.styleable.EmojiView);
			this.indicatorDotsColor = values.getColor(R.styleable.EmojiView_indicatorDotsColor, EmojiDefault.INDICATOR_DOTS_COLOR);
			this.showIndicatorDots = values.getBoolean(R.styleable.EmojiView_showIndicatorDots, EmojiDefault.SHOW_INDICATOR_DOTS);
			this.autoHideSoftInput = values.getBoolean(R.styleable.EmojiView_autoHideSoftInput, EmojiDefault.AUTO_HIDE_SOFT_INPUT);
			this.rowNum = values.getInteger(R.styleable.EmojiView_rowNum, EmojiDefault.ROW_NUM);
			this.colNum = values.getInteger(R.styleable.EmojiView_colNum, EmojiDefault.COL_NUM);
			this.borderColor = values.getColor(R.styleable.EmojiView_borderColor, EmojiDefault.BORDER_COLOR);
			this.categoryHeight = (int) values.getDimension(R.styleable.EmojiView_categoryHeight, EmojiDefault.CATEGORY_HEIGHT);
			values.recycle();
		}
	}
	
	public void initPages() {
		this.setGravity(Gravity.FILL);
		this.setOrientation(VERTICAL);
		this.setFocusable(false);
		this.setWeightSum(1);
		
		this.emojiViews = new EmojiView[5];
		for (int i = 0; i < 5; ++i) {
			this.emojiViews[i] = new EmojiView(this.getContext());
			this.emojiViews[i].setCategory(i);
			LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, 0, 1);
			this.emojiViews[i].setLayoutParams(params);
			this.emojiViews[i].setEditText(edit);
			this.emojiViews[i].setAutoHideSoftInput(false);
			this.emojiViews[i].setShowIndicatorDots(this.showIndicatorDots);
			this.emojiViews[i].setIndicatorDotsColor(this.indicatorDotsColor);
			this.emojiViews[i].setIconNum(this.rowNum, this.colNum);
			this.addView(this.emojiViews[i]);
		}
		
		this.borders = new View[5];
		View horizontal = new View(this.getContext());
		horizontal.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, 1, 0));
		horizontal.setBackgroundColor(this.borderColor);
		this.addView(horizontal);
		this.borders[0] = horizontal;
		
		LinearLayout categoryLayout = new LinearLayout(this.getContext());
		categoryLayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, this.categoryHeight, 0));
		categoryLayout.setGravity(Gravity.FILL);
		categoryLayout.setOrientation(HORIZONTAL);
		categoryLayout.setWeightSum(5);
		int[] drawableId = new int[] {
				R.drawable.category_people_dark,
				R.drawable.category_places_dark,
				R.drawable.category_nature_dark,
				R.drawable.category_objects_dark,
				R.drawable.category_symbols_dark
		};
		for (int i = 0; i < drawableId.length; ++i) {
			if (i > 0) {
				View vertical = new View(this.getContext());
				vertical.setLayoutParams(new LayoutParams(1, LayoutParams.MATCH_PARENT, 0));
				vertical.setBackgroundColor(this.borderColor);
				categoryLayout.addView(vertical);
				this.borders[i] = vertical;
			}
			ImageView imageView = new ImageView(this.getContext());
			imageView.setScaleType(ScaleType.FIT_CENTER);
			imageView.setLayoutParams(new LayoutParams(0, LayoutParams.MATCH_PARENT, 1));
			imageView.setImageDrawable(this.getResources().getDrawable(drawableId[i]));
			imageView.setPadding(0, 0, 0, 15);
			imageView.setId(drawableId[i]);
			imageView.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					int id = v.getId();
					if (id == R.drawable.category_people_dark) {
						setCurrentCategory(EmojiCategory.PEOPLE);
					} else if (id == R.drawable.category_places_dark) {
						setCurrentCategory(EmojiCategory.PLACES);
					} else if (id == R.drawable.category_nature_dark) {
						setCurrentCategory(EmojiCategory.NATURE);
					} else if (id == R.drawable.category_objects_dark) {
						setCurrentCategory(EmojiCategory.OBJECTS);
					} else if (id == R.drawable.category_symbols_dark) {
						setCurrentCategory(EmojiCategory.SYMBOLS);
					}
				}
			});
			categoryLayout.addView(imageView);
		}
		this.addView(categoryLayout);
	}

	public void show() {
		if (!this.initialized) {
			this.initPages();
			this.initialized = true;
		}
		for (int i = 0; i < this.emojiViews.length; ++i) {
			if (this.currentCategory == i) {
				this.emojiViews[i].show();
			} else {
				this.emojiViews[i].hide();
			}
		}
		if (this.autoHideSoftInput) {
			InputMethodManager imm = (InputMethodManager) this.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
			imm.hideSoftInputFromWindow(this.getWindowToken(), 0);
		}
		this.isHidden = false;
		this.setVisibility(VISIBLE);
	}
	
	public void hide() {
		this.isHidden = true;
		this.setVisibility(GONE);
	}
	
	public void toggle() {
		if (this.isHidden) {
			this.show();
		} else {
			this.hide();
		}
	}
	
	public void setBorderColor(int color) {
		this.borderColor = color;
		if (this.borders != null) {
			for (View border : this.borders) {
				border.setBackgroundColor(color);
			}
		}
	}
	
	public void setCurrentCategory(int category) {
		this.currentCategory = category;
		this.show();
	}
	
	public void setEditText(EditText edit) {
		this.edit = edit;
		if (this.emojiViews != null) {
			for (EmojiView view : this.emojiViews) {
				view.setEditText(edit);
			}
		}
	}
	
	public void setIndicatorDotsColor(int color) {
		this.indicatorDotsColor = color;
		if (this.emojiViews != null) {
			for (EmojiView view : this.emojiViews) {
				view.setIndicatorDotsColor(color);
			}
		}
	}
	
	public void setShowIndicatorDots(boolean value) {
		this.showIndicatorDots = value;
		if (this.emojiViews != null) {
			for (EmojiView view : this.emojiViews) {
				view.setShowIndicatorDots(value);
			}
		}
	}
	
	public void setRowNum(int rowNum) {
		this.setIconNum(rowNum, this.colNum);
	}
	
	public void setColNum(int colNum) {
		this.setIconNum(this.rowNum, colNum);
	}
	
	public void setIconNum(int rowNum, int colNum) {
		this.rowNum = rowNum;
		this.colNum = colNum;
		if (this.emojiViews != null) {
			for (EmojiView view : this.emojiViews) {
				view.setIconNum(rowNum, colNum);
			}
		}
	}
}
