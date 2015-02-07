package com.zhaohg.emojiview;

import android.util.SparseIntArray;

public class EmojiCodeMap {
	
	private static SparseIntArray all = new SparseIntArray();
	private static SparseIntArray people = new SparseIntArray();
	private static SparseIntArray nature = new SparseIntArray();
	private static SparseIntArray objects = new SparseIntArray();
	private static SparseIntArray places = new SparseIntArray();
	private static SparseIntArray symbols = new SparseIntArray();
	
	static {
		SparseIntArray[] maps = new SparseIntArray[] { people, nature, objects, places, symbols };
		for (int i = 0; i < maps.length; ++i) {
			for (int j = 0; j < people.size(); ++j) {
				int key = people.keyAt(j);
				int value = people.get(key);
				all.put(key, value);
			}
		}
	}
}
