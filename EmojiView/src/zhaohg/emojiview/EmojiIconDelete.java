package zhaohg.emojiview;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.widget.EditText;

public class EmojiIconDelete extends EmojiIcon {
	
	public EmojiIconDelete(Context context, EmojiView emojiView) {
		super(context, emojiView);
		this.setImageDrawable(this.getResources().getDrawable(R.drawable.emoji_delete));
	}
	
	@Override
	public void onActionUp() {
		EditText edit = this.emojiView.getEditText();
		if (edit != null) {
			Editable text = edit.getText();
			int start = edit.getSelectionStart();
			int end = edit.getSelectionEnd();
			if (start == end) {
				long firstUnicode = findPrevUnicode(text, start);
				int firstSize = Character.charCount((int)firstUnicode);
				long secondUnicode = findPrevUnicode(text, start - firstSize);
				int secondSize = Character.charCount((int)secondUnicode);
				if (secondUnicode != 0) {
					long code = ((secondUnicode) << 32) | firstUnicode;
					if (EmojiCodeMap.exists(code)) {
						int size = firstSize + secondSize;
						text.delete(start - size, start);
						return;
					}
				}
				if (EmojiCodeMap.exists(firstUnicode)) {
					text.delete(start - firstSize, start);
					return;
				}
			}
			edit.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
		}
	}
	
	private int findPrevUnicode(Editable text, int index) {
		int code = 0;
		int size = 1;
		while (index - size >= 0) {
			code = Character.codePointAt(text, index - size);
			if (size == Character.charCount(code)) {
				break;
			}
			++size;
		}
		return code;
	}
}
