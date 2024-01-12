package com.example.asesment3

import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.asesment3.R

class RatingActivity : AppCompatActivity() {

    private lateinit var ratingBar: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        // Initialize the RatingBar
        ratingBar = findViewById(R.id.ratingBar)

        // Set a listener for rating changes
        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            // Handle the rating change, you can perform actions based on the new rating
            showToast("Rating: $rating")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
