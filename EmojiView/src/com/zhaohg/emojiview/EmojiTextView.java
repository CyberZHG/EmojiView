package com.zhaohg.emojiview;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.TextView;

public class EmojiTextView extends TextView {
	
	public EmojiTextView(Context context) {
		super(context);
	}
	
	public EmojiTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public EmojiTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	public void setText(CharSequence text, BufferType type) {
        SpannableStringBuilder builder = new SpannableStringBuilder(text);
        EmojiSetup.setupEmoji(this.getContext(), builder, (int) this.getTextSize());
		super.setText(builder, type);
	}
}
