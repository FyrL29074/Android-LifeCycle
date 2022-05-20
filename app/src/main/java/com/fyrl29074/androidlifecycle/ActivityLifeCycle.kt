package com.fyrl29074.androidlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

const val LOG_LIFECYCLE = "LifeCycle LOG"

class ActivityLifeCycle : AppCompatActivity() {

    private lateinit var contextView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)

        contextView = findViewById(R.id.activity_lifecycle)

        Log.d(LOG_LIFECYCLE, "onCreate Activity")
//        Snackbar.make(contextView, "onCreate Activity", Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_LIFECYCLE, "onStart Activity")
//        Snackbar.make(contextView, "onStart Activity", Snackbar.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_LIFECYCLE, "onResume Activity")
//        Snackbar.make(contextView, "onResume Activity", Snackbar.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_LIFECYCLE, "onPause Activity")
//        Snackbar.make(contextView, "onPause Activity", Snackbar.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_LIFECYCLE, "onStop Activity")
//        Snackbar.make(contextView, "onStop Activity", Snackbar.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_LIFECYCLE, "onDestroy Activity")
//        Snackbar.make(contextView, "onDestroy Activity", Snackbar.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_LIFECYCLE, "onRestart Activity")
//        Snackbar.make(contextView, "onRestart Activity", Snackbar.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(LOG_LIFECYCLE, "onSaveInstanceState Activity")
//        Snackbar.make(contextView, "onSaveInstanceState Activity", Snackbar.LENGTH_SHORT).show()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(LOG_LIFECYCLE, "onRestoreInstanceState Activity")
//        Snackbar.make(contextView, "onRestoreInstanceState Activity", Snackbar.LENGTH_SHORT).show()
    }
}