package com.zhaohg.emojiview;

import java.util.ArrayList;
import java.util.List;

import android.view.View;

public class EmojiResourceManager {
	
	private static EmojiResourceManager instance = null;
	private static Object mutex = new Object();
	
	private EmojiResourceManager() {
	}
	
	public static EmojiResourceManager getInstance() {
		if (instance == null) {
			synchronized (mutex) {
				if (instance == null) {
					instance = new EmojiResourceManager();
				}
			}
		}
		return instance;
	}
	
	public List<View> getViews(int rowNum, int colNum) {
		List<View> views = new ArrayList<View>();
		return views;
	}
}
