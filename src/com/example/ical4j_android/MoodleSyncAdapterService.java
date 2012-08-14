package com.example.ical4j_android;

import net.fortuna.ical4j.data.CalendarBuilder;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


public class MoodleSyncAdapterService extends Service {
	
	@Override
	public void onCreate() {

		super.onCreate();
		System.out.println("WTF A");
		CalendarBuilder b = new CalendarBuilder(); // <-- tle se usuje

		System.out.println("WTF B");
	}
 
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
 

}