package com.ilifesmart;

import android.app.Application;
import android.content.Context;

import skin.support.SkinCompatManager;
import skin.support.app.SkinCardViewInflater;
import skin.support.constraint.app.SkinConstraintViewInflater;
import skin.support.design.app.SkinMaterialViewInflater;

public class DemoApplication extends Application {

	public static final String TAG = "DemoApplication";
	private static Context sContext;

	@Override
	public void onCreate() {
		super.onCreate();

		sContext = getApplicationContext();
		SkinCompatManager.withoutActivity(this) 								// 基础空间换肤
						.addInflater(new SkinMaterialViewInflater()) 		// material design
						.addInflater(new SkinConstraintViewInflater())	// ConstrainLayout换肤
						.addInflater(new SkinCardViewInflater())				// CardView
						.setSkinStatusBarColorEnable(false)							// 关闭状态栏换肤
						.setSkinWindowBackgroundEnable(false)						// 关闭windowbackground换肤
						.loadSkin();
	}

	public static Context getContext() {
		return sContext;
	}
}
