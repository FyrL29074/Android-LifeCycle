package com.fyrl29074.androidlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

const val LOG_LIFECYCLE = "LifeCycle LOG"

class ActivityLifeCycle : AppCompatActivity() {

    lateinit var contextView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)

        contextView = findViewById(R.id.activity_lifecycle)

        Log.d(LOG_LIFECYCLE, "onCreate")
        Snackbar.make(contextView, "onCreate", Snackbar.LENGTH_SHORT).show()
        (findViewById<TextView>(R.id.text_view)).text = "onCreate"
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_LIFECYCLE, "onStart")
        Snackbar.make(contextView, "onStart", Snackbar.LENGTH_SHORT).show()
        (findViewById<TextView>(R.id.text_view)).text = "onStart"
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_LIFECYCLE, "onResume")
        Snackbar.make(contextView, "onResume", Snackbar.LENGTH_SHORT).show()
        (findViewById<TextView>(R.id.text_view)).text = "onResume"
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_LIFECYCLE, "onPause")
        Snackbar.make(contextView, "onPause", Snackbar.LENGTH_SHORT).show()
        (findViewById<TextView>(R.id.text_view)).text = "onPause"
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_LIFECYCLE, "onStop")
        Snackbar.make(contextView, "onStop", Snackbar.LENGTH_SHORT).show()
        (findViewById<TextView>(R.id.text_view)).text = "onStop"
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_LIFECYCLE, "onDestroy")
        Snackbar.make(contextView, "onDestroy", Snackbar.LENGTH_SHORT).show()
        (findViewById<TextView>(R.id.text_view)).text = "onDestroy"
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_LIFECYCLE, "onRestart")
        Snackbar.make(contextView, "onRestart", Snackbar.LENGTH_SHORT).show()
        (findViewById<TextView>(R.id.text_view)).text = "onRestart"
    }
}