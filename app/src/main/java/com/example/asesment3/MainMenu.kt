package com.example.asesment3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        val galeri: Button = findViewById(R.id.galeri)
        val kontak: Button = findViewById(R.id.logokontak)
        val info: Button = findViewById(R.id.logoinfo)
        val quit: Button = findViewById(R.id.logologout)
        kontak.setOnClickListener {
            val intent = Intent(this@MainMenu, Contact::class.java)
            startActivity(intent)
        }
        galeri.setOnClickListener {
            val intent = Intent (this@MainMenu, GalleryActivity::class.java)
            startActivity(intent)
        }
        info.setOnClickListener {
            val intent = Intent (this@MainMenu, InformationActivity::class.java)
            startActivity(intent)
        }
        quit.setOnClickListener {
            val intent = Intent (this@MainMenu, login::class.java)
            startActivity(intent)
        }
    }
}