package com.example.ical4j_android;

import net.fortuna.ical4j.data.CalendarBuilder;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;


public class MoodleSyncAdapterService extends Service {
	
	private static final String tag = "MoodleSyncAdapterService";

	@Override
	public void onCreate() {

		super.onCreate();
		Log.d(tag,"WTF A");
		CalendarBuilder b = new CalendarBuilder(); // <-- tle se usuje

		Log.d(tag,"WTF B");
	}
 
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
 

}