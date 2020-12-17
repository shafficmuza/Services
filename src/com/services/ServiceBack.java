package com.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class ServiceBack extends Service {
	
	MediaPlayer player;

	public IBinder onBind(Intent intent) {
		return null;
	}
	
	// Creates Service
	public void onCreate() {
		Toast.makeText(this, "My Service Created", Toast.LENGTH_LONG).show();
		
		player = MediaPlayer.create(this, R.raw.samba);		// R.raw.samba is MP3 filename
		player.setLooping(false); // Set looping
	}

	// Kills Service
	public void onDestroy() {
		Toast.makeText(this, "My Service Stopped", Toast.LENGTH_LONG).show();
		player.stop();
	}
	
	// Starts Service
	public void onStart(Intent intent, int startid) {
		Toast.makeText(this, "My Service Started", Toast.LENGTH_LONG).show();
		player.start();
	}
}
