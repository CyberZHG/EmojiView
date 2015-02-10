package com.zhaohg.emojiview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
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
	
	private int categoryHeight = 50;
	
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
	}
	
	public void initPages() {
		this.setGravity(Gravity.FILL);
		this.setOrientation(VERTICAL);
		this.setFocusable(false);
		if (attrs != null) {
			TypedArray values = this.getContext().obtainStyledAttributes(attrs, R.styleable.EmojiView);
			this.categoryHeight = (int) values.getDimension(R.styleable.EmojiView_categoryHeight, 50);
			values.recycle();
		}
		
		this.emojiViews = new EmojiView[5];
		for (int i = 0; i < 5; ++i) {
			this.emojiViews[i] = new EmojiView(this.getContext(), this.attrs);
			this.emojiViews[i].setCategory(i);
			LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, 0, 1);
			this.emojiViews[i].setLayoutParams(params);
			this.emojiViews[i].setEditText(edit);
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
	
	public void setEditText(EditText edit) {
		this.edit = edit;
		if (this.emojiViews != null) {
			for (int i = 0; i < this.emojiViews.length; ++i) {
				this.emojiViews[i].setEditText(edit);
			}
		}
	}
	
	public void setCurrentCategory(int category) {
		this.currentCategory = category;
		this.show();
	}
	
}
