package com.example.asesment3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class Slide1BottomSheetFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.bottom_sheet_slide1, container, false)

        // First ImageSlider
        val imageList1 = ArrayList<SlideModel>() // Create image list
        imageList1.add(SlideModel(R.drawable.kegiatanindoor1, "Ibu Guru Paud/TK Latifa"))
        imageList1.add(SlideModel(R.drawable.kegiatanindoor2, "Kegiatan Acara Aneuk Miet Di AcehTV"))
        imageList1.add(SlideModel(R.drawable.kegiatanindoor3, "Disiarkan Secara Live"))

        val imageSlider1 = view.findViewById<ImageSlider>(R.id.image_slider1)
        imageSlider1.setImageList(imageList1)

        // Second ImageSlider
        val imageList2 = ArrayList<SlideModel>() // Create another image list
        imageList2.add(SlideModel(R.drawable.kegiatanoutdoor1, "Kegiatan Praktek Shalat di Mesjid Raya Baiturrahman Banda Aceh"))
        imageList2.add(SlideModel(R.drawable.kegiatanoutdoor2, "Foto Kegiatan Dari Depan"))
        imageList2.add(SlideModel(R.drawable.kegiatanoutdoor3, "Foto Anak Murid Beserta Dengan Ibu Gurunya "))

        val imageSlider2 = view.findViewById<ImageSlider>(R.id.image_slider2)
        imageSlider2.setImageList(imageList2)

        return view
    }
}