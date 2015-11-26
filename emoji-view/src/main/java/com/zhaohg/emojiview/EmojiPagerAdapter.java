package com.zhaohg.emojiview;

import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class EmojiPagerAdapter extends PagerAdapter {

	private List<View> views;

	public EmojiPagerAdapter(List<View> views) {
		this.views = views;
	}

	@Override
	public int getCount() {
		return this.views.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}

	@Override
    public Object instantiateItem(ViewGroup container, int position) {
		View view = this.views.get(position);
        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(this.views.get(position));
    }

}
