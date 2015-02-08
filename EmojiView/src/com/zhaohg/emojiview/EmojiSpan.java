package com.zhaohg.emojiview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;

public class EmojiSpan extends DynamicDrawableSpan {
	
	private Drawable drawable;
	
	public EmojiSpan(Context context, int drawableId, int size) {
		this.drawable = context.getResources().getDrawable(drawableId);
		this.drawable.setBounds(0, 0, size, size);
	}
	
	@Override
	public Drawable getDrawable() {
		return drawable;
	}

}
