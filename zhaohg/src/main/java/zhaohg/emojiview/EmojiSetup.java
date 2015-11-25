package zhaohg.emojiview;

import android.content.Context;
import android.text.Spannable;

public class EmojiSetup {
	
	public static void setupEmoji(Context context, Spannable text, int textSize) {
		setupEmoji(context, text, textSize, 0, text.length());
	}
	
	public static void setupEmoji(Context context, Spannable text, int textSize,
			int start, int length) {
		for (int i = start, size; i < start + length; i += size) {
			int drawableId = -1;
			long firstUnicode = Character.codePointAt(text, i);
			size = Character.charCount((int)firstUnicode);
			if (firstUnicode != 0 && i + size < start + length) {
				long secondUnicode = Character.codePointAt(text, i + size);
				long code = ((firstUnicode) << 32) | secondUnicode;
				if (EmojiCodeMap.exists(code)) {
					drawableId = EmojiCodeMap.getDrawableID(code);
					size += Character.charCount((int)secondUnicode);
				}
			}
			if (drawableId == -1) {
				if (EmojiCodeMap.exists(firstUnicode)) {
					drawableId = EmojiCodeMap.getDrawableID(firstUnicode);
				}
			}
			if (drawableId != -1) {
				EmojiSpan span = new EmojiSpan(context, drawableId, textSize);
				text.setSpan(span, i, i + size, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
			}
		}
	}
}
