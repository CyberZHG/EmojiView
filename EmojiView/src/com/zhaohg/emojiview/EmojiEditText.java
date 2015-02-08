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
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        this.setupEmoji();
    }

	private void setupEmoji() {
		EmojiSetup.setupEmoji(this.getContext(), this.getText(), (int)this.getTextSize());
	}
}
