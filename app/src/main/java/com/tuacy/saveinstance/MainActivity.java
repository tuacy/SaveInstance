package com.tuacy.saveinstance;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tuacy.saveinstance.activity.ActivityInstanceActivity;
import com.tuacy.saveinstance.fragment.FragmentInstanceActivity;
import com.tuacy.saveinstance.view.ViewInstanceActivity;

public class MainActivity extends AppCompatActivity {

	private Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;
		findViewById(R.id.button_activity_instance).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ActivityInstanceActivity.startUp(mContext);
			}
		});

		findViewById(R.id.button_fragment_instance).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mContext.startActivity(new Intent(mContext, FragmentInstanceActivity.class));
			}
		});

		findViewById(R.id.button_view_instance).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mContext.startActivity(new Intent(mContext, ViewInstanceActivity.class));
			}
		});
	}
}
