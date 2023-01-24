package com.techhue.activities

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MyStateChangeActivity : Activity() {
    // Called at the start of the full lifetime.
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize Activity and inflate the UI.
        Log.d("MyStateChangeActivity", "onCreate()")
    }

    // Called after onCreate has finished, use to restore UI state
    public override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d("MyStateChangeActivity", "onRestoreInstanceState")
    }

    // Called before subsequent visible lifetimes
    // for an activity process.
    public override fun onRestart() {
        super.onRestart()
        Log.d("MyStateChangeActivity", "onRestart")
    }

    // Called at the start of the visible lifetime.
    public override fun onStart() {
        super.onStart()
        Log.d("MyStateChangeActivity", "onStart")
    }

    // Called at the start of the active lifetime.
    public override fun onResume() {
        super.onResume()
        Log.d("MyStateChangeActivity", "onResume")
    }

    // Called to save UI state changes at the
    // end of the active lifecycle.
    public override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        Log.d("MyStateChangeActivity", "onSaveInstanceState")
    }

    // Called at the end of the active lifetime.
    public override fun onPause() {
        super.onPause()
        Log.d("MyStateChangeActivity", "onPause")
    }

    // Called at the end of the visible lifetime.
    public override fun onStop() {
        super.onStop()
        Log.d("MyStateChangeActivity", "onStop")
    }

    // Sometimes called at the end of the full lifetime.
    public override fun onDestroy() {
        super.onDestroy()
        Log.d("MyStateChangeActivity", "onDestroy")
    }
}