package zhaohg.emojiview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.View;

public class EmojiIndicator extends View {

	private Paint paint = new Paint();

	private int currentIndex = 0;
	private int totalNum = 0;

	public EmojiIndicator(Context context) {
		super(context);
		paint.setAntiAlias(true);
		paint.setARGB(200, 219, 229, 234);
	}

	public void setDotsColor(int color) {
		paint.setColor(color);
	}

	public void setCurrentIndex(int index) {
		this.currentIndex = index;
	}

	public void setTotalNum(int num) {
		this.totalNum = num;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		if (this.totalNum > 0) {
			float mid = this.totalNum * 0.5f;
			float width = this.getWidth();
			float height = this.getHeight();
			float midX = width * 0.5f;
			float midY = height * 0.5f;
			for (int i = 0; i < this.totalNum; ++i) {
				float shift = i - mid;
				float x = midX + shift * 20.0f;
				float y = midY;
				if (i == this.currentIndex) {
					paint.setStyle(Style.FILL);
				} else {
					paint.setStyle(Style.STROKE);
				}
				canvas.drawCircle(x, y, 4.0f, paint);
			}
		}
	}

}
