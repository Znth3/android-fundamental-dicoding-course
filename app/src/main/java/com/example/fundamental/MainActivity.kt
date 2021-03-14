package com.example.fundamental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToIntent: Button = findViewById(R.id.btn_to_intent)
        btnToIntent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_to_intent -> {
                val moveToIntentActivity = Intent(this@MainActivity, IntentActivity::class.java)
                startActivity(moveToIntentActivity)
            }
        }
    }
}