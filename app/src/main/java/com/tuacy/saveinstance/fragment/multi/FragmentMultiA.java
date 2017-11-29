package com.tuacy.saveinstance.fragment.multi;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tuacy.saveinstance.R;


public class FragmentMultiA extends Fragment {

	private static final String TAG = "tuacy";

	public static FragmentMultiA instance() {
		return new FragmentMultiA();
	}

	@Override
	public void onAttach(Context context) {
		super.onAttach(context);
		Log.d(TAG, "A onAttach");
	}

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "A onCreate");
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		Log.d(TAG, "A onCreateView");
		return inflater.inflate(R.layout.fragment_multi_a, container, false);
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		Log.d(TAG, "A onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d(TAG, "A onStart");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d(TAG, "A onResume");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.d(TAG, "A onPause");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.d(TAG, "A onStop");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d(TAG, "A onDestroyView");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "A onDestroy");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.d(TAG, "A onDetach");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d(TAG, "A onSaveInstanceState");
	}


}
