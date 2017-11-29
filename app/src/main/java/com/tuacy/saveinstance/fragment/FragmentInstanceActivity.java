package com.tuacy.saveinstance.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tuacy.saveinstance.R;
import com.tuacy.saveinstance.fragment.backstack.FragmentBackStackActivity;
import com.tuacy.saveinstance.fragment.multi.FragmentMultiActivity;
import com.tuacy.saveinstance.fragment.single.FragmentSingleActivity;


public class FragmentInstanceActivity extends AppCompatActivity {

	private Context mContext;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment_save_instance);
		mContext = this;
		findViewById(R.id.button_single_fragment).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mContext.startActivity(new Intent(mContext, FragmentSingleActivity.class));			}
		});

		findViewById(R.id.button_multi_fragment).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mContext.startActivity(new Intent(mContext, FragmentMultiActivity.class));
			}
		});

		findViewById(R.id.button_back_stack_fragment).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mContext.startActivity(new Intent(mContext, FragmentBackStackActivity.class));
			}
		});
	}
}
