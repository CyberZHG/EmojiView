package com.zhaohg.emojiview;

import java.util.List;

import android.content.Context;

public abstract class EmojiList {
	
	public abstract List<EmojiIcon> getIcons(Context context);
	
	protected EmojiIcon newIcon(Context context, int code) {
		EmojiIconAdd icon = new EmojiIconAdd(context);
		icon.setEmojiCode(code);
		return icon;
	}
	
	protected EmojiIcon newIcon(Context context, int code1, int code2) {
		EmojiIconAdd icon = new EmojiIconAdd(context);
		icon.setEmojiCode(code1, code2);
		return icon;
	}
}
