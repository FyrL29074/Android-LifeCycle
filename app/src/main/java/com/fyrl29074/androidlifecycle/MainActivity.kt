package com.fyrl29074.androidlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        findViewById<Button>(R.id.activity).setOnClickListener {
            val intent = Intent(this, ActivityLifeCycle::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.fragment).setOnClickListener {
            val intent = Intent(this, NavigationActivity::class.java)
            startActivity(intent)
        }
    }
}