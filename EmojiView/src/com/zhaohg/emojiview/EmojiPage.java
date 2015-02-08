package com.zhaohg.emojiview;

import java.util.List;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

public class EmojiPage extends LinearLayout {
	
	private EmojiIcon[][] icons;
	
	public EmojiPage(Context context) {
		super(context);
	}
	
	public void initIcons(int rowNum, int colNum, List<EmojiIcon> icons) {
		this.icons = new EmojiIcon[rowNum][colNum];
		this.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 
				ViewGroup.LayoutParams.MATCH_PARENT));
		this.setOrientation(VERTICAL);
		this.setGravity(Gravity.FILL);
		this.setWeightSum(rowNum);
		for (int i = 0; i < rowNum; ++i) {
			LinearLayout row = new LinearLayout(this.getContext());
			row.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1));
			row.setOrientation(HORIZONTAL);
			row.setGravity(Gravity.FILL);
			row.setWeightSum(colNum);
			for (int j = 0; j < colNum; ++j) {
				View icon;
				if (i == rowNum - 1 && j == colNum - 1) {
					icon = new EmojiIconDelete(this.getContext());
				} else {
					int index = i * colNum + j;
					if (index < icons.size()) {
						icon = icons.get(index);
						this.icons[i][j] = icons.get(index);
					} else {
						icon = new View(this.getContext());
					}
				}
				icon.setPadding(4, 4, 4, 4);
				icon.setLayoutParams(new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 
						ViewGroup.LayoutParams.MATCH_PARENT, 1));
				row.addView(icon);
			}
			this.addView(row);
		}
	}
	
	public void setEditText(EditText edit) {
		for (int i = 0; i < this.icons.length; ++i) {
			for (int j = 0; j < this.icons[i].length; ++j) {
				if (this.icons[i][j] != null) {
					this.icons[i][j].setEditText(edit);
				}
			}
		}
	}

}
