package com.example.ical4j_android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final Intent koledar = new Intent(this, MoodleSyncAdapterService.class);


		Button klikni_me = (Button) findViewById(R.id.button1);
		klikni_me.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startService(koledar);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
