package com.example.configchangeskotlin

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MyActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MyStateChangeActivity", "onRestoreInstanceState")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyStateChangeActivity", "onRestart")
    }

    override fun onStart() {
        super.onStart()
        // Apply any required UI change now that the Activity is visible.
        Log.d("MyStateChangeActivity", "onStart")
    }

    // Called at the start of the active lifetime.
    override fun onResume() {
        super.onResume()
        Log.d("MyStateChangeActivity", "onResume")
    }

    // Called to save UI state changes at the
    // end of the active lifecycle.

    // Called at the end of the active lifetime.
    override fun onPause() {
        super.onPause()
        Log.d("MyStateChangeActivity", "onPause")
    }

    // Called at the end of the visible lifetime.
    override fun onStop() {
        super.onStop()
        Log.d("MyStateChangeActivity", "onStop")
    }

    // Sometimes called at the end of the full lifetime.
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyStateChangeActivity", "onDestroy")
    }

    /**
     * Listing 3-6: Handling configuration changes in code
     */
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        // [ ... Update any UI based on resource values ... ]
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // [ ... React to different orientation ... ]\
        }
        if (newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_NO) {
            // [ ... React to changed keyboard visibility ... ]
        }
    }
}

