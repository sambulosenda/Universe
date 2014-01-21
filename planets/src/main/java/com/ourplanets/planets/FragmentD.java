package com.ourplanets.planets;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentD extends Fragment {

	Button button;
	Button button2;

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		button = (Button) getView().findViewById(R.id.button_4);
		button2 = (Button) getView().findViewById(R.id.earth_satellite);

		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				String url = "http://space-facts.com/earth/";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			}
		});

		button2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getActivity(), SatelliteEarth.class);
				startActivity(intent);
			}
		});
	}

	public FragmentD() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_d, container, false);
	}
}