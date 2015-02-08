package com.zhaohg.emojiview;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EmojiView emojiView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText editText = (EditText) this.findViewById(R.id.emojiEditText);
		this.emojiView = (EmojiView) this.findViewById(R.id.emojiView);
		this.emojiView.setEditText(editText);
		
		final TextView textView = (TextView) this.findViewById(R.id.emojiTextView);
		editText.addTextChangedListener(new TextWatcher() {

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}

			@Override
			public void afterTextChanged(Editable s) {
				textView.setText(editText.getText());
			}
			
		});
	}
	
	public void toggleEmojiView(View view) {
		this.emojiView.toggle();
	}
}
