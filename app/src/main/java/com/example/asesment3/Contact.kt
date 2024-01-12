package com.example.asesment3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Contact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kontak)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Guru Paud"
                1 -> tab.text = "Guru TK"
            }
        }.attach()
    }

    private class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
        override fun getItemCount(): Int {
            return 2 // Number of tabs
        }

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> PageFragment.newInstance("Guru Paud")
                1 -> PageFragment.newInstance("Guru TK")
                else -> throw IllegalArgumentException("Invalid tab position")
            }
        }
    }
}
