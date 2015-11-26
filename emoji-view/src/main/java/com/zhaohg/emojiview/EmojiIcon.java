package com.zhaohg.emojiview;

import android.content.Context;
import android.widget.ImageView;

public class EmojiIcon extends ImageView {

	protected EmojiView emojiView;

	public EmojiIcon(Context context, EmojiView emojiView) {
		super(context);
		this.emojiView = emojiView;
		this.initView();
	}

	private void initView() {
		this.setScaleType(ScaleType.FIT_CENTER);
	}

	public void onActionUp() {
	}

}
