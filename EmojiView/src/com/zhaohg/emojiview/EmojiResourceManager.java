package com.zhaohg.emojiview;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.View;

public class EmojiResourceManager {
	
	private Context context;
	
	public EmojiResourceManager(Context context) {
		this.context = context;
	}
	
	public List<View> getViews(int rowNum, int colNum) {
		List<View> views = new ArrayList<View>();
		EmojiList list = new EmojiList(this.context);
    	List<EmojiIcon> emojiList = list.getIcons(EmojiCodeMap.ALL);
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
