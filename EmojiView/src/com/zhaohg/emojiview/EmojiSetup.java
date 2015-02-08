package com.zhaohg.emojiview;

import android.content.Context;
import android.text.Spannable;

public class EmojiSetup {
	
	public static void setupEmoji(Context context, Spannable text, int textSize) {
		setupEmoji(context, text, textSize, 0, text.length());
	}
	
	public static void setupEmoji(Context context, Spannable text, int textSize,
			int start, int length) {
		EmojiSpan[] spans = text.getSpans(start, start + length, EmojiSpan.class);
		for (EmojiSpan span : spans) {
			text.removeSpan(span);
		}
		for (int i = start; i < start + length; ++i) {
			int drawableId = -1;
			int size = 1;
			long firstUnicode = Character.codePointAt(text, i);
			if (EmojiCodeMap.exists(firstUnicode)) {
				drawableId = EmojiCodeMap.getDrawableID(firstUnicode);
			} else if (i < start + length - 1) {
				long secondUnicode = Character.codePointAt(text, i + 1);
				long code = ((firstUnicode) << 32) | secondUnicode;
				if (EmojiCodeMap.exists(code)) {
					drawableId = EmojiCodeMap.getDrawableID(code);
					++i;
					size = 2;
				}
			}
			if (drawableId != -1) {
				EmojiSpan span = new EmojiSpan(context, drawableId, textSize);
				text.setSpan(span, i, i + size, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
			}
		}
	}
}
