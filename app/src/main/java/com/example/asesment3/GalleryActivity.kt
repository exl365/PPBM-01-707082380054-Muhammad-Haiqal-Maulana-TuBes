package com.example.asesment3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.ncorti.slidetoact.SlideToActView

class GalleryActivity : AppCompatActivity() {

    private lateinit var viewModel: GalleryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)

        // Initialize ViewModel using ViewModelProvider without a custom factory
        viewModel = ViewModelProvider(this)[GalleryViewModel::class.java]

        // Initialize SlideToActViews
        val slide1: SlideToActView = findViewById(R.id.slide1)
        val slide2: SlideToActView = findViewById(R.id.slide2)

        // Set listeners for SlideToActViews
        slide1.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                // Handle slide 1 completion
                viewModel.showSlide1BottomSheet()
                // Reset the SlideToActView to its default position
                slide1.setCompleted(false, withAnimation = true)
            }
        }

        slide2.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                // Handle slide 2 completion
                viewModel.showSlide2BottomSheet()
                // Reset the SlideToActView to its default position
                slide2.setCompleted(false, withAnimation = true)
            }
        }

        // Observe LiveData events to trigger BottomSheetDialogFragments
        viewModel.showSlide1BottomSheetEvent.observe(this) { showSlide1BottomSheet() }
        viewModel.showSlide2BottomSheetEvent.observe(this) { showSlide2BottomSheet() }
    }

    private fun showSlide1BottomSheet() {
        val bottomSheetFragment = Slide1BottomSheetFragment()
        bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
    }

    private fun showSlide2BottomSheet() {
        val bottomSheetFragment = Slide2BottomSheetFragment()
        bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
    }
}
