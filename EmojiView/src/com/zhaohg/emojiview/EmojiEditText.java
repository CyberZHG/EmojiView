package com.zhaohg.emojiview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class EmojiEditText extends EditText {
	
	public EmojiEditText(Context context) {
		super(context);
	}
	
	public EmojiEditText(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public EmojiEditText(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	@Override
	public void setText(CharSequence text, BufferType type) {
		setupEmoji();
	}

	private void setupEmoji() {
		// TODO
	}
}
