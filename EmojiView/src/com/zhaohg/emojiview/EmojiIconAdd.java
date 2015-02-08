package com.zhaohg.emojiview;

import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.widget.EditText;

public class EmojiIconAdd extends EmojiIcon {
	
	private long emojiCode;
	private String emojiText = ""; 
	
	public EmojiIconAdd(Context context, EmojiView emojiView) {
		super(context, emojiView);
	}
	
	private String convertCodeToString(int code) {
		return new String(Character.toChars(code));
	}
	
	public void setEmojiCode(long code) {
		this.emojiCode = code;
		if ((code | 0xffffffff00000000L) == 0) {
			this.setEmojiText(convertCodeToString((int)code));
		} else {
			int high = (int)((code & 0xffffffff00000000L) >> 32);
			int low = (int)(code & 0x00000000ffffffffL);
			this.setEmojiText(convertCodeToString(high) + convertCodeToString(low));
		}
	}
	
	public void setEmojiText(String text) {
		this.emojiText = text;
	}
	
	@Override
	public void onActionUp() {
		EditText edit = this.emojiView.getEditText();
		if (edit != null) {
			int index = edit.getSelectionStart();
			if (index >= 0) {
				SpannableStringBuilder builder = new SpannableStringBuilder();
				builder.append(edit.getText());
				builder.insert(index, this.emojiText);
				int drawableId = EmojiCodeMap.getDrawableID(this.emojiCode);
				EmojiSpan span = new EmojiSpan(this.getContext(), drawableId, (int) edit.getTextSize());
				builder.setSpan(span, index, index + this.emojiText.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
				edit.setText(builder);
			}
		}
	}
}
