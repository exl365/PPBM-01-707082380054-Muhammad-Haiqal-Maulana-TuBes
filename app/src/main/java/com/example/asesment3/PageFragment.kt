package com.example.asesment3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment


class PageFragment : Fragment() {

    companion object {
        private const val ARG_TAB_TYPE = "tab_type"

        fun newInstance(tabType: String): PageFragment {
            val fragment = PageFragment()
            val args = Bundle()
            args.putString(ARG_TAB_TYPE, tabType)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_page, container, false)
        val listView: ListView = view.findViewById(R.id.listView)

        val items = arrayOf("Guru 1", "Guru 2", "Guru 3", "Guru 4", "Guru 5")
        val imageResources = intArrayOf(
            R.drawable.gurupaud1,
            R.drawable.gurupaud2,
            R.drawable.gurupaud3,
            R.drawable.gurupaud4,
            R.drawable.gurupaud5
        )

        val adapter = CustomAdapter(requireContext(), items, imageResources)
        listView.adapter = adapter

        // Set item click listener
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = items[position]
            val selectedImageResource = imageResources[position]

            // Create an intent to start DetailActivity
            val intent = Intent(requireContext(), DetailActivity::class.java)
            // Pass data to the intent
            intent.putExtra("itemName", selectedItem)
            intent.putExtra("itemImageResource", selectedImageResource)
            // Start DetailActivity
            startActivity(intent)
        }

        return view
    }
    private class CustomAdapter(
        private val context: Context,
        private val items: Array<String>,
        private val imageResources: IntArray
    ) : BaseAdapter() {

        override fun getCount(): Int = items.size

        override fun getItem(position: Int): Any = items[position]

        override fun getItemId(position: Int): Long = position.toLong()

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
            val textView: TextView = view.findViewById(R.id.textView)
            val imageView: ImageView = view.findViewById(R.id.imageView)
            // Set the text and image for each item
            textView.text = items[position]
            imageView.setImageResource(imageResources[position])
            return view
        }
    }
}