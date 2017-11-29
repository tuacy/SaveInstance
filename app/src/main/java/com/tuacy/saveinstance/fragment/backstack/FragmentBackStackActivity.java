package com.tuacy.saveinstance.fragment.backstack;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tuacy.saveinstance.R;

import java.util.List;


public class FragmentBackStackActivity extends AppCompatActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment_back_stack);
		// 这里一定要判断，要不然Activity恢复的时候Fragment会重复加入
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction().add(R.id.layout_content_fragment, FragmentBackStackA.instance()).commit();
		}

		findViewById(R.id.button_fragment_num).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				List<Fragment> fragments = getSupportFragmentManager().getFragments();
				((TextView) findViewById(R.id.text_fragment_num)).setText(fragments == null ? "" : fragments.size() + "");
			}
		});

		findViewById(R.id.button_add_fragment).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
				transaction.add(R.id.layout_content_fragment, FragmentBackStackB.instance()).commit();
				transaction.addToBackStack(null);
			}
		});
	}
}
