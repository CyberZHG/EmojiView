package zhaohg.emojiview;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;

public class EmojiView extends LinearLayout {
	
	private EditText edit;
	private EmojiIndicator indicator;
	private boolean initialized = false;
	private boolean isHidden;
	
	private int category = EmojiDefault.CATEGORY;
	private int indicatorDotsColor = EmojiDefault.INDICATOR_DOTS_COLOR;
	private boolean showIndicatorDots = EmojiDefault.SHOW_INDICATOR_DOTS;
	private boolean autoHideSoftInput = EmojiDefault.AUTO_HIDE_SOFT_INPUT;
	private int rowNum = EmojiDefault.ROW_NUM;
	private int colNum = EmojiDefault.COL_NUM;
	
	public EmojiView(Context context) {
		super(context);
		this.initView(null);
	}
	
	public EmojiView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.initView(attrs);
	}
	
	public EmojiView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.initView(attrs);
	}

	private void initView(AttributeSet attrs) {
		this.setGravity(Gravity.FILL);
		this.setOrientation(VERTICAL);
		this.setFocusable(false);
		this.setPadding(20, 20, 20, 20);
		this.hide();
		if (attrs != null) {
			TypedArray values = this.getContext().obtainStyledAttributes(attrs, R.styleable.EmojiView);
			this.category = values.getInt(R.styleable.EmojiView_category, EmojiDefault.CATEGORY);
			this.indicatorDotsColor = values.getColor(R.styleable.EmojiView_indicatorDotsColor, EmojiDefault.INDICATOR_DOTS_COLOR);
			this.showIndicatorDots = values.getBoolean(R.styleable.EmojiView_showIndicatorDots, EmojiDefault.SHOW_INDICATOR_DOTS);
			this.autoHideSoftInput = values.getBoolean(R.styleable.EmojiView_autoHideSoftInput, EmojiDefault.AUTO_HIDE_SOFT_INPUT);
			this.rowNum = values.getInteger(R.styleable.EmojiView_rowNum, EmojiDefault.ROW_NUM);
			this.colNum = values.getInteger(R.styleable.EmojiView_colNum, EmojiDefault.COL_NUM);
			values.recycle();
		}
	}
	
	public void setCategory(int cat) {
		this.category = cat;
		if (this.isHidden) {
			this.initialized = false;
		} else {
			this.initPages();
		}
	}
	
	public void setAutoHideSoftInput(boolean value) {
		this.autoHideSoftInput = value;
	}
	
	public void setIndicatorDotsColor(int color) {
		this.indicatorDotsColor = color;
		if (this.indicator != null) {
			this.indicator.setDotsColor(color);
		}
	}
	
	public void setShowIndicatorDots(boolean value) {
		this.showIndicatorDots = value;
		if (this.indicator != null) {
			if (value) {
				this.indicator.setVisibility(VISIBLE);
			} else {
				this.indicator.setVisibility(GONE);
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
		if (this.rowNum != rowNum || this.colNum != colNum) {
			this.rowNum = rowNum;
			this.colNum = colNum;
			if (this.isHidden) {
				this.initialized = false;
			} else {
				this.initPages();
			}
		}
	}
	
	public int getRowNum() {
		return this.rowNum;
	}
	
	public int getColNum() {
		return this.colNum;
	}
	
	public void setEditText(EditText edit) {
		this.edit = edit;
	}
	
	public EditText getEditText() {
		return this.edit;
	}
	
	private void initPages() {
		// Initialize sub pages.
		final List<View> views = new ArrayList<View>();
    	long[] codeList = EmojiCodeMap.getCodeList(this.category);
		int itemPerPage = rowNum * colNum - 1;
		int pageNum = (codeList.length + itemPerPage - 1) / itemPerPage;
		for (int i = 0; i < pageNum; ++i) {
			EmojiPage page = new EmojiPage(this.getContext(), this);
			int start = i * itemPerPage;
			int end = start + itemPerPage;
			if (end > codeList.length) {
				end = codeList.length;
			}
			page.setConfiguration(rowNum, colNum, codeList, start);
			views.add(page);
		}
		if (pageNum >= 1) {
			((EmojiPage)views.get(0)).initIcons();
			if (pageNum >= 2) {
				((EmojiPage)views.get(1)).initIcons();
			}
		}
		// Initialize view pager.
		final ViewPager viewPager = new ViewPager(this.getContext());
		viewPager.setAdapter(new EmojiPagerAdapter(views));
		LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 
				LayoutParams.MATCH_PARENT, 5);
		viewPager.setLayoutParams(params);
		this.addView(viewPager);
		// Initialize indicator dots.
		this.indicator = new EmojiIndicator(this.getContext());
		params = new LayoutParams(LayoutParams.MATCH_PARENT, 30);
		this.indicator.setLayoutParams(params);
		this.indicator.setCurrentIndex(0);
		this.indicator.setTotalNum(pageNum);
		this.indicator.setDotsColor(this.indicatorDotsColor);
		viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			private int pageIndex = -1;
			private boolean dragged = false;
			
			public void loadNextPage() {
				if (0 < this.pageIndex && this.pageIndex < views.size() - 1) {
					((EmojiPage)views.get(this.pageIndex + 1)).initIcons();
				}
			}
			
			@Override
			public void onPageScrollStateChanged(int state) {
				switch (state) {
				case ViewPager.SCROLL_STATE_DRAGGING:
					if (this.dragged) {
						this.loadNextPage();
					}
					this.dragged = true;
					break;
				case ViewPager.SCROLL_STATE_SETTLING:
					break;
				case ViewPager.SCROLL_STATE_IDLE:
					if (this.dragged) {
						this.loadNextPage();
						this.dragged = false;
					}
					break;
				}
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {}

			@Override
			public void onPageSelected(int index) {
				indicator.setCurrentIndex(index);
				indicator.invalidate();
				this.pageIndex = index;
			}
		});
		this.indicator.setDotsColor(this.indicatorDotsColor);
		this.addView(this.indicator);
	}
	
	public void show() {
		if (!this.initialized) {
			this.initialized = true;
			initPages();
		}
		this.isHidden = false;
		this.setVisibility(VISIBLE);
		if (this.showIndicatorDots) {
			if (this.indicator != null) {
				this.indicator.setVisibility(VISIBLE);
			}
		}
		if (this.autoHideSoftInput) {
			InputMethodManager imm = (InputMethodManager) this.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
			imm.hideSoftInputFromWindow(this.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
		}
	}
	
	public void hide() {
		this.isHidden = true;
		this.setVisibility(GONE);
	}
	
	public void toggle() {
		if (this.isHidden) {
			show();
		} else {
			hide();
		}
	}
}
