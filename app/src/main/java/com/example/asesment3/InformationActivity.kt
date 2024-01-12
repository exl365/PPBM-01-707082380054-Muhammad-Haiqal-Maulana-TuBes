package com.example.asesment3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class InformationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi)
        val rateButton: Button = findViewById(R.id.logorating)
        val viewDev: Button = findViewById(R.id.logodev)
        rateButton.setOnClickListener {
            val intent = Intent (this@InformationActivity, RatingActivity::class.java)
            startActivity(intent)
        }
        viewDev.setOnClickListener {
            val intent = Intent (this@InformationActivity, infodeveloper::class.java)
            startActivity(intent)
        }
    }
}