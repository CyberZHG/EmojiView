package com.zhaohg.emojiview;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
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
	
	private int indicatorDotsColor = Color.argb(200, 219, 229, 234);
	private boolean showIndicatorDots = true;
	private boolean autoHideSoftInput = true;
	private int rowNum = 3;
	private int colNum = 7;
	
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
		this.hide();
		if (attrs != null) {
			TypedArray values = this.getContext().obtainStyledAttributes(attrs, R.styleable.EmojiView);
			this.setIndicatorDotsColor(values.getColor(R.styleable.EmojiView_indicatorDotsColor, Color.argb(200, 219, 229, 234)));
			this.setShowIndicatorDots(values.getBoolean(R.styleable.EmojiView_showIndicatorDots, true));;
			this.autoHideSoftInput = values.getBoolean(R.styleable.EmojiView_autoHideSoftInput, true);
			this.rowNum = values.getInteger(R.styleable.EmojiView_rowNum, 3);
			this.colNum = values.getInteger(R.styleable.EmojiView_colNum, 7);
			values.recycle();
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
		EmojiList list = new EmojiList(this.getContext());
    	List<EmojiIcon> emojiList = list.getIcons(this, EmojiCodeMap.PEOPLE);
		int itemPerPage = rowNum * colNum - 1;
		int pageNum = (emojiList.size() + itemPerPage - 1) / itemPerPage;
		for (int i = 0; i < pageNum; ++i) {
			EmojiPage page = new EmojiPage(this.getContext(), this);
			int start = i * itemPerPage;
			int end = start + itemPerPage;
			if (end > emojiList.size()) {
				end = emojiList.size();
			}
			page.setConfiguration(rowNum, colNum, emojiList.subList(start, end));
			views.add(page);
		}
		if (pageNum >= 1) {
			((EmojiPage)views.get(0)).initIcons();
			if (pageNum >= 2) {
				((EmojiPage)views.get(1)).initIcons();
			}
		}
		// Initialize view pager.
		ViewPager viewPager = new ViewPager(this.getContext());
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
		viewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageScrollStateChanged(int arg0) {}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {}

			@Override
			public void onPageSelected(int index) {
				indicator.setCurrentIndex(index);
				indicator.invalidate();
				if (index < views.size() - 1) {
					((EmojiPage)views.get(index + 1)).initIcons();
				}
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
			imm.hideSoftInputFromWindow(this.getWindowToken(), 0);
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
	
	public void setActiveIcon(EmojiIcon icon) {
		// TODO
	}
}
