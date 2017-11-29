package com.tuacy.saveinstance.fragment.backstack;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tuacy.saveinstance.R;


public class FragmentBackStackB extends Fragment {

	private static final String TAG = "tuacy";

	public static FragmentBackStackB instance() {
		return new FragmentBackStackB();
	}

	@Override
	public void onAttach(Context context) {
		super.onAttach(context);
		Log.d(TAG, "B onAttach");
	}

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "B onCreate");
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		Log.d(TAG, "B onCreateView");
		return inflater.inflate(R.layout.fragment_back_stack_b, container, false);
	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		Log.d(TAG, "B onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d(TAG, "B onStart");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d(TAG, "B onResume");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.d(TAG, "B onPause");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.d(TAG, "B onStop");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d(TAG, "B onDestroyView");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "B onDestroy");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.d(TAG, "B onDetach");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d(TAG, "B onSaveInstanceState");
	}


}
