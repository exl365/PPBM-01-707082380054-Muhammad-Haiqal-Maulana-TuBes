package com.example.asesment3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    // Define LiveData for triggering BottomSheetDialogFragments
    private val _showSlide1BottomSheetEvent = MutableLiveData<Unit>()
    val showSlide1BottomSheetEvent: LiveData<Unit>
        get() = _showSlide1BottomSheetEvent

    private val _showSlide2BottomSheetEvent = MutableLiveData<Unit>()
    val showSlide2BottomSheetEvent: LiveData<Unit>
        get() = _showSlide2BottomSheetEvent

    // Function to trigger showing Slide1BottomSheet
    fun showSlide1BottomSheet() {
        _showSlide1BottomSheetEvent.value = Unit
    }

    // Function to trigger showing Slide2BottomSheet
    fun showSlide2BottomSheet() {
        _showSlide2BottomSheetEvent.value = Unit
    }
}