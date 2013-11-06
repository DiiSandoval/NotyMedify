package com.medynotify.activity;

import java.util.Timer;
import java.util.TimerTask;

import com.example.medynotify.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashMedyNotify extends Activity {

	private static final long SPLASH_SCREEN_DELAY = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splashmedynotify);
		
		//Mirar de alguna manera si el usuario ya esta logeado o no

		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				Intent firstActivity = new Intent().setClass(
						SplashMedyNotify.this, LoginActivity.class);
				startActivity(firstActivity);

				finish();
			}
		};

		Timer timer = new Timer();
		timer.schedule(task, SPLASH_SCREEN_DELAY);
	}

}
