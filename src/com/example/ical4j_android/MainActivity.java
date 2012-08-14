package com.example.ical4j_android;

import net.fortuna.ical4j.data.CalendarBuilder;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private static final String tag = "MainActivity";

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
		Log.d(tag,"WTF A");
		CalendarBuilder b = new CalendarBuilder(); // <-- tle se usuje

		Log.d(tag,"WTF B");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
