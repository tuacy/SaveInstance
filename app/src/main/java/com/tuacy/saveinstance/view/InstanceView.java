package com.tuacy.saveinstance.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * 一个简单的功能，每次点击一下我们就加一
 */
public class InstanceView extends View {

	private static final String BUNDLE_SUPER = "super";
	private static final String BUNDLE_VALUE = "value";

	private int       mValue;
	private TextPaint mTextPaint;

	public InstanceView(Context context) {
		this(context, null);
	}

	public InstanceView(Context context, @Nullable AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public InstanceView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initData();
	}

	private void initData() {
		mValue = 0;
		setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mValue++;
				invalidate();
			}
		});
		mTextPaint = new TextPaint();
		mTextPaint.setColor(Color.RED);
		mTextPaint.setTextSize(80);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawText(mValue + "", getWidth() / 2, getHeight() / 2, mTextPaint);
	}

	@Nullable
	@Override
	protected Parcelable onSaveInstanceState() {
		Log.d("tuacy", "view onSaveInstanceState");
		Bundle bundle = new Bundle();
		bundle.putParcelable(BUNDLE_SUPER, super.onSaveInstanceState());
		bundle.putInt(BUNDLE_VALUE, mValue);
		return bundle;
	}

	@Override
	protected void onRestoreInstanceState(Parcelable state) {
		Bundle bundle = (Bundle) state;
		super.onRestoreInstanceState(bundle.getParcelable(BUNDLE_SUPER));
		mValue = bundle.getInt(BUNDLE_VALUE);
		invalidate();
		Log.d("tuacy", "view onRestoreInstanceState");
	}
}
