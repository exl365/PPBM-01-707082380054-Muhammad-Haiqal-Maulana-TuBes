package com.example.asesment3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class Slide2BottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CardViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.bottom_sheet_slide2, container, false)

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        // Sample data for the RecyclerView
        val cardViewItems = listOf(
            CardViewItem(R.drawable.visi, "MENJADI PIONER PENGEMBANGAN KEPRIBADIAN ANAK YANG BERAKHLAQUL KARIMAH. MANDIRI DAN CERDAS MENUJU MASYARAKAT RABBANI"),
            CardViewItem(R.drawable.misi, "1. MEWUJUDKAN KESEJAHTERAAN ANAK MELALUI PENDIDIKAN, PELAYANAN, DAN PENGASUHAN\n" +
                    "\n" +
                    "2. MENCIPTAKAN LINGKUNGAN YANG BAIK BAGI PERTUMBUHAN DAN PERKEMBANGAN SERTA POTENSI ANAK\n" +
                    "\n" +
                    "3. MEMBIASAKAN ANAK BERPERILAKU HIDUP BERSIH, SEHAT DAN BERAKHLAK MULIA"),
            CardViewItem(R.drawable.tujuan, "1.TERWUJUDNYA PENYELENGGARAAN PENDIDIKAN, PERAWATAN, PENGASUHAN. DAN PERLINDUNGAN ANAK YANG MAKSIMAL UNTUK MENUNJANG TUMBUH KEMBANG ANAK\n" +
                    "\n" +
                    "2. TERCIPTANYA LINGKUNGAN PENDIDIKAN YANG SEHAT, AMAN, NYAMAN, RAPI DAN BERSIH\n" +
                    "\n" +
                    "3. TERWUJUDNYA ANAK YANG SEHAT JASMANI DAN ROHANI.\n" +
                    "\n" +
                    "4. MEMBENTUK KARAKTER DAN KEPRIBADIAN ISLAMI PADA DIRI ANAK.\n" +
                    "\n" +
                    "5. MENJADIKAN ANAK MAMPU BERFIKIR, TERAMPIL, MANDIRI DAN BERKOMUNIKASI SERTA BERTINDAK PRODUKTIF DAN KREATIF MELALUI BAHASA, MUSIK, DAN KARYA.\n" +
                    "\n" +
                    "6. TERCIPTANYA SUASANA BELAJAR YANG MENYENANGKAN DAN KONDUSIF\n" +
                    "\n" +
                    "7. MENUMBUHKAN JIWA BERKORBAN PADA ANAK MELALUI PRAKTIK BERQURBAN DAN PENGAJARAN"),
            // Add more items as needed
        )

        // Initialize and set the adapter for the RecyclerView
        adapter = CardViewAdapter(cardViewItems)
        recyclerView.adapter = adapter

        return view
    }
}

// Create an adapter for the RecyclerView
class CardViewAdapter(private val items: List<CardViewItem>) :
    RecyclerView.Adapter<CardViewAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Define the views inside the item layout
        // For example:
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardview, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Bind data to the views inside the item layout
        val item = items[position]
        holder.imageView.setImageResource(item.imageResource)
        holder.descriptionTextView.text = item.description
    }

    override fun getItemCount(): Int {
        return items.size
    }
}