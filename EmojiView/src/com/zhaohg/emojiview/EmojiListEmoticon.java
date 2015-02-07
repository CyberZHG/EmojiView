package com.zhaohg.emojiview;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;

public class EmojiListEmoticon extends EmojiList {

	@Override
	public List<EmojiIcon> getIcons(Context context) {
		List<EmojiIcon> icons = new ArrayList<EmojiIcon>();
		for (int code = 0x1f601; code <= 0x1f64f; ++code) {
			icons.add(this.newIcon(context, code));
		}
		return icons;
	}
}
