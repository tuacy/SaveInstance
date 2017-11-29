package com.tuacy.saveinstance.fragment.single;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tuacy.saveinstance.R;

import java.util.List;


public class FragmentSingleActivity extends AppCompatActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment_single);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction().add(R.id.layout_fragment_content, FragmentSingle.instance()).commit();
		}
		findViewById(R.id.button_get_fragment).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				List<Fragment> fragments = getSupportFragmentManager().getFragments();
				((TextView) findViewById(R.id.text_fragment_num)).setText(fragments == null ? "0" : fragments.size() + "");
			}
		});
	}
}
