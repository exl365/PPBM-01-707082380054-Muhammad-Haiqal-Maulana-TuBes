package com.example.asesment3

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login: Button = findViewById(R.id.buttonlogin)
        login.setOnClickListener {
            // Show Snackbar
            val snackbar = Snackbar.make(it, "Login Berhasil...", Snackbar.LENGTH_LONG)
            snackbar.show()

            // Delay before moving to the next activity
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, MainMenu::class.java)
                startActivity(intent)
            }, 2000) // Delay in milliseconds (2 seconds in this example)
        }

        val daftar: Button = findViewById(R.id.buttondaftar)
        daftar.setOnClickListener {
            // Show Snackbar for register button
            val snackbar = Snackbar.make(it, "Memasuki Ke Halaman Registrasi...", Snackbar.LENGTH_LONG)
            snackbar.show()

            // Delay before moving to the registration activity
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, registrasi::class.java)
                startActivity(intent)
            }, 2000) // Delay in milliseconds (2 seconds in this example)
        }


    }
}
