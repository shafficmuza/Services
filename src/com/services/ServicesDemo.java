package com.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ServicesDemo extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button buttonStart = (Button) findViewById(R.id.buttonstart);
		Button buttonStop = (Button) findViewById(R.id.buttonstop);

		// To start Service
		buttonStart.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				startService(new Intent(ServicesDemo.this,
						ServiceBack.class));
				// startService method will call onCreate and onStart from Service class
			}
		});

		// To stop Service
		buttonStop.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				stopService(new Intent(ServicesDemo.this, ServiceBack.class));
				// Calls onDestroy method from Service class
			}
		});
	}

}