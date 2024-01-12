package com.example.asesment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView


class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIMEOUT: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screeen)

        val imageView: ImageView = findViewById(R.id.gambarpembuka)

        val fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        imageView.startAnimation(fadeIn)

        Handler(Looper.getMainLooper()).postDelayed({
            // Start your main activity with fade out animation
            val intent = Intent(this, login::class.java)
            startActivity(intent)

            // Apply fade out animation
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out)

            finish()
        }, SPLASH_TIMEOUT)
    }
}
