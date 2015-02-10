package com.zhaohg.emojiview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
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
	
	private AttributeSet attrs;
	private EditText edit;
	private EmojiView[] emojiViews;
	private float currentCategory = EmojiCategory.PEOPLE;
	
	private int indicatorDotsColor = EmojiDefault.INDICATOR_DOTS_COLOR;
	private boolean showIndicatorDots = EmojiDefault.SHOW_INDICATOR_DOTS;
	private boolean autoHideSoftInput = EmojiDefault.AUTO_HIDE_SOFT_INPUT;
	private int rowNum = EmojiDefault.ROW_NUM;
	private int colNum = EmojiDefault.COL_NUM;
	
	private int categoryHeight = 30;
	
	public EmojiViewEx(Context context) {
		super(context);
		this.initView(null);
	}
	
	public EmojiViewEx(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.initView(attrs);
	}

	public EmojiViewEx(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		this.initView(attrs);
	}
	
	public void initView(AttributeSet attrs) {
		this.attrs = attrs;
		this.hide();
		if (attrs != null) {
			TypedArray values = this.getContext().obtainStyledAttributes(attrs, R.styleable.EmojiView);
			this.setIndicatorDotsColor(values.getColor(R.styleable.EmojiView_indicatorDotsColor, EmojiDefault.INDICATOR_DOTS_COLOR));
			this.setShowIndicatorDots(values.getBoolean(R.styleable.EmojiView_showIndicatorDots, EmojiDefault.SHOW_INDICATOR_DOTS));;
			this.autoHideSoftInput = values.getBoolean(R.styleable.EmojiView_autoHideSoftInput, EmojiDefault.AUTO_HIDE_SOFT_INPUT);
			this.rowNum = values.getInteger(R.styleable.EmojiView_rowNum, EmojiDefault.ROW_NUM);
			this.colNum = values.getInteger(R.styleable.EmojiView_colNum, EmojiDefault.COL_NUM);
			values.recycle();
		}
	}
	
	public void initPages() {
		this.setGravity(Gravity.FILL);
		this.setOrientation(VERTICAL);
		this.setFocusable(false);
		this.setWeightSum(1);
		if (attrs != null) {
			TypedArray values = this.getContext().obtainStyledAttributes(attrs, R.styleable.EmojiView);
			this.categoryHeight = (int) values.getDimension(R.styleable.EmojiView_categoryHeight, 50);
			values.recycle();
		}
		
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
		
		LinearLayout categoryLayout = new LinearLayout(this.getContext());
		categoryLayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, this.categoryHeight));
		categoryLayout.setGravity(Gravity.FILL);
		categoryLayout.setOrientation(HORIZONTAL);
		categoryLayout.setWeightSum(5);
		int[] drawableId = new int[] {
				R.drawable.category_people,
				R.drawable.category_places,
				R.drawable.category_nature,
				R.drawable.category_objects,
				R.drawable.category_symbols
		};
		for (int i = 0; i < drawableId.length; ++i) {
			ImageView imageView = new ImageView(this.getContext());
			imageView.setScaleType(ScaleType.FIT_CENTER);
			imageView.setLayoutParams(new LayoutParams(0, LayoutParams.MATCH_PARENT, 1));
			imageView.setImageDrawable(this.getResources().getDrawable(drawableId[i]));
			imageView.setPadding(5, 5, 5, 5);
			imageView.setId(drawableId[i]);
			imageView.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					switch (v.getId()) {
					case R.drawable.category_people:
						setCurrentCategory(EmojiCategory.PEOPLE);
						break;
					case R.drawable.category_places:
						setCurrentCategory(EmojiCategory.PLACES);
						break;
					case R.drawable.category_nature:
						setCurrentCategory(EmojiCategory.NATURE);
						break;
					case R.drawable.category_objects:
						setCurrentCategory(EmojiCategory.OBJECTS);
						break;
					case R.drawable.category_symbols:
						setCurrentCategory(EmojiCategory.SYMBOLS);
						break;
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
