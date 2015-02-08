package com.zhaohg.emojiview;

import java.util.List;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;

public class EmojiView extends LinearLayout {
	
	private EditText edit;
	private boolean initialized = false;
	private boolean isHidden;
	
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
			this.autoHideSoftInput = values.getBoolean(R.styleable.EmojiView_autoHideSoftInput, true);
			this.rowNum = values.getInteger(R.styleable.EmojiView_rowNum, 3);
			this.rowNum = values.getInteger(R.styleable.EmojiView_colNum, 7);
			values.recycle();
		}
	}
	
	public void setAutoHideSoftInput(boolean value) {
		this.autoHideSoftInput = value;
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
	
	public void setEditText(EditText edit) {
		this.edit = edit;
	}
	
	private void initPages() {
		EmojiResourceManager manager = new EmojiResourceManager(this.getContext());
		List<View> views = manager.getViews(rowNum, colNum);
		for (View view : views) {
			((EmojiPage)view).setEditText(edit);
		}
		ViewPager viewPager = new ViewPager(this.getContext());
		viewPager.setAdapter(new EmojiPagerAdapter(views));
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, 
				LayoutParams.MATCH_PARENT);
		viewPager.setLayoutParams(params);
		this.addView(viewPager);
	}
	
	public void show() {
		if (!this.initialized) {
			initPages();
		}
		this.isHidden = false;
		this.setVisibility(VISIBLE);
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
}
