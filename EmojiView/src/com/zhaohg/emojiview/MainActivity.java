package com.zhaohg.emojiview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EmojiView emojiView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		EditText edit = (EditText) this.findViewById(R.id.emojiEdit);
		this.emojiView = (EmojiView) this.findViewById(R.id.emojiView);
		this.emojiView.init(edit);
	}
	
	public void toggleEmojiView(View view) {
		this.emojiView.toggle();
	}
}
