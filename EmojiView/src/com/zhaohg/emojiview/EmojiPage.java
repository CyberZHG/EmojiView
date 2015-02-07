package com.zhaohg.emojiview;

import java.util.List;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;

public class EmojiPage extends TableLayout {
	
	private EmojiIcon[][] icons;
	
	public EmojiPage(Context context) {
		super(context);
	}
	
	public void initIcons(int rowNum, int colNum, List<EmojiIcon> icons) {
		this.icons = new EmojiIcon[rowNum][colNum];
		this.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 
				ViewGroup.LayoutParams.MATCH_PARENT));
		this.setOrientation(VERTICAL);
		this.setStretchAllColumns(true);
		this.setWeightSum(rowNum);
		for (int i = 0; i < rowNum; ++i) {
			TableRow row = new TableRow(this.getContext());
			row.setLayoutParams(new TableLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1));
			row.setGravity(Gravity.FILL);
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
				icon.setPadding(2, 2, 2, 2);
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
