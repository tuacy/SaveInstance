package com.tuacy.saveinstance.fragment.multi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tuacy.saveinstance.R;

import java.util.List;


public class FragmentMultiActivity extends AppCompatActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment_multi);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
									   .add(R.id.layout_content_fragment, FragmentMultiA.instance())
									   .add(R.id.layout_content_fragment, FragmentMultiB.instance())
									   .commit();
		}

		findViewById(R.id.button_fragment_num).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				List<Fragment> fragments = getSupportFragmentManager().getFragments();
				((TextView) findViewById(R.id.text_fragment_num)).setText(fragments == null ? "" : fragments.size() + "");
			}
		});
	}
}
