package zhaohg.emojiview;

import android.content.Context;
import android.text.Editable;
import android.widget.EditText;

public class EmojiIconAdd extends EmojiIcon {
	
	private String emojiText = ""; 
	
	public EmojiIconAdd(Context context, EmojiView emojiView) {
		super(context, emojiView);
	}
	
	private String convertCodeToString(int code) {
		return new String(Character.toChars(code));
	}
	
	public void setEmojiCode(long code) {
		if ((code >> 32) == 0) {
			this.setEmojiText(convertCodeToString((int)code));
		} else {
			int high = (int)(code >> 32);
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
				Editable editable = edit.getEditableText();
				editable.insert(index, this.emojiText);
			}
		}
	}
}
