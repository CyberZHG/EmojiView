package com.zhaohg.emojiview;

import android.content.Context;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;

public class EmojiIconAdd extends EmojiIcon {
	
	private String emojiText = ""; 
	
	public EmojiIconAdd(Context context) {
		super(context);
		this.initListener();
	}
	
	private String convertCodeToString(int code) {
		return new String(Character.toChars(code));
	}
	
	public void setEmojiCode(long code) {
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
	
	public void addEmojiText() {
		if (this.edit != null) {
			int index = this.edit.getSelectionStart();
			if (index >= 0) {
				Editable editable = this.edit.getEditableText();
				editable.insert(index, this.emojiText);
			}
		}
	}
	
	public void initListener() {
		this.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				EmojiIconAdd self = (EmojiIconAdd) view;
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
				case MotionEvent.ACTION_HOVER_ENTER:
					self.activate();
					break;
                case MotionEvent.ACTION_CANCEL:
                case MotionEvent.ACTION_OUTSIDE:
				case MotionEvent.ACTION_HOVER_EXIT:
					self.inactivate();
					break;
				case MotionEvent.ACTION_UP:
					self.inactivate();
					self.addEmojiText();
					break;
				}
				return false;
			}
		});
	}
}
