package com.zhaohg.emojiview;

import android.content.Context;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;

public class EmojiIconDelete extends EmojiIcon {
	
	public EmojiIconDelete(Context context) {
		super(context);
		this.setImageDrawable(this.getResources().getDrawable(R.drawable.delete));
	}
	
	public void deleteOneCharacter() {
		if (this.edit != null) {
			int index = this.edit.getSelectionStart();
			if (index > 0) {
				Editable editable = this.edit.getEditableText();
				editable.delete(index - 1, index);
			}
		}
	}

	public void initListener() {
		this.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				EmojiIconDelete self = (EmojiIconDelete) view;
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
				case MotionEvent.ACTION_HOVER_ENTER:
					self.activate();
					break;
				case MotionEvent.ACTION_HOVER_EXIT:
					self.inactivate();
					break;
				case MotionEvent.ACTION_UP:
					self.inactivate();
					self.deleteOneCharacter();
					break;
				}
				return false;
			}
		});
	}
}
