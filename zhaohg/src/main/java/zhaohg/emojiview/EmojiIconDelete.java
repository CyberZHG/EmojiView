package zhaohg.emojiview;

import android.content.Context;
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
			edit.dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
		}
	}
}
