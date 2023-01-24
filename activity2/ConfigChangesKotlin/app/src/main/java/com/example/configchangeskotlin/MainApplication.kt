package com.example.configchangeskotlin

import android.app.Application
import android.content.res.Configuration
import android.util.Log


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
        Log.d(TAG, "onCreate")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.d(TAG, "onLowMemory")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.d(TAG, "onTrimMemory")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG, "onConfigurationChanged")
    }

    companion object {
        // Returns the application instance
        var instance: MyApplication? = null
            private set
        private const val TAG = "MyApplication"
    }
}
