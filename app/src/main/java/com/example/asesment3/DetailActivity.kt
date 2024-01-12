package com.example.asesment3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_layout)

        val detailImageView: ImageView = findViewById(R.id.detailImageView)
        val teacherNameTextView: TextView = findViewById(R.id.teacherNameTextView)
        val subjectTextView: TextView = findViewById(R.id.subjectTextView)
        val experienceTextView: TextView = findViewById(R.id.experienceTextView)
        val contactInfoTextView: TextView = findViewById(R.id.contactInfoTextView)
        val contactButton: Button = findViewById(R.id.contactButton)

        // Sample data
        val teacherName = "Guru"
        val subject = "Jabatan"
        val experience = "Mengajar Selama..."
        val contactInfo = "Email: gmail.com\nPhone: 08123456789"

        // Set data to the views
        teacherNameTextView.text = teacherName
        subjectTextView.text = subject
        experienceTextView.text = experience
        contactInfoTextView.text = contactInfo

        // Handle contact button click
        contactButton.setOnClickListener {
            // Replace with the actual contact information or action
            val email = "bla@gmail.com"
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:$email")
            startActivity(intent)
        }
    }
}