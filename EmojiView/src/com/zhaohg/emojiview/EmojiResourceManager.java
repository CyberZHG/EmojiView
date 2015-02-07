package com.zhaohg.emojiview;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;

public class EmojiResourceManager {
	
	public static final int EMOJI_TYPE_EMOTICON = 0;
	public static final int EMOJI_TYPE_DINGBAT = 1;
	public static final int EMOJI_TYPE_ENCLOSED = 2;
	public static final int EMOJI_TYPE_UNCATEGORIZED = 3;
	
	private Context context;
	
	public EmojiResourceManager(Context context) {
		this.context = context;
	}
	
	public List<View> getViews(int rowNum, int colNum) {
		List<View> views = new ArrayList<View>();
		EmojiListEmoticon generator = new EmojiListEmoticon();
    	List<EmojiIcon> emojiList = generator.getIcons(this.context);
		int itemPerPage = rowNum * colNum - 1;
		int pageNum = (emojiList.size() + itemPerPage - 1) / itemPerPage;
		for (int i = 0; i < pageNum; ++i) {
			EmojiPage page = new EmojiPage(this.context);
			int start = i * itemPerPage;
			int end = start + itemPerPage;
			if (end > emojiList.size()) {
				end = emojiList.size();
			}
			page.initIcons(rowNum, colNum, emojiList.subList(start, end));
			views.add(page);
		}
		return views;
	}
}
