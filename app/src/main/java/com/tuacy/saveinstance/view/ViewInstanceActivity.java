package com.tuacy.saveinstance.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tuacy.saveinstance.R;

/**
 * 自定义的View一定要设置id，要不然调用不到View的onSaveInstanceState()、onRestoreInstanceState()方法。
 */
public class ViewInstanceActivity extends AppCompatActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_save_instance);
	}
}
