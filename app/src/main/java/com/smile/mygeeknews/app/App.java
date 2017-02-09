package com.smile.mygeeknews.app;

import android.app.Application;

/**
 * Descripe:
 * Created by Tough
 * Data: 2017/2/9  10:25
 */
public class App extends Application {
    private static App instance;

    public static synchronized App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
