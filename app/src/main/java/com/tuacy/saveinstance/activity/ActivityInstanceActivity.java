package com.tuacy.saveinstance.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tuacy.saveinstance.R;

/**
 * 用于测试Activity状态的保存和恢复
 */
public class ActivityInstanceActivity extends AppCompatActivity {

	public static void startUp(Context context) {
		context.startActivity(new Intent(context, ActivityInstanceActivity.class));
	}

	private final static String BUNDLE_VALUE = "value_text";

	private Button   mButton;
	private TextView mTextView;
	private String   mValueText;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_save_instance);
		initView();
		initEvent();
		initData();
		if (savedInstanceState == null) {
			//新建的Activity
		} else {
			//从异常退出中恢复Activity,这里也可以处理状态的恢复
		}
		Log.d("tuacy", "onCreate");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("tuacy", "onStart");

	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("tuacy", "onPause");

	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("tuacy", "onResume");

	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("tuacy", "onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("tuacy", "onDestroy");

	}

	private void initView() {
		mButton = findViewById(R.id.button_save_value);
		mTextView = findViewById(R.id.text_save_value);
	}

	private void initEvent() {
		mButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mValueText = "save instance";
				mTextView.setText(mValueText);
			}
		});
	}

	private void initData() {
		mTextView.setText(mValueText == null ? "" : mValueText);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putString(BUNDLE_VALUE, mValueText);
		Log.d("tuacy", "onSaveInstanceState");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		mValueText = savedInstanceState.getString(BUNDLE_VALUE);
		mTextView.setText(mValueText == null ? "" : mValueText);
		Log.d("tuacy", "onRestoreInstanceState");
	}
}
