package com.aditya.imscbit.maths

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.aditya.imscbit.R
import com.aditya.imscbit.maths.PagerAdapter
import com.google.android.material.tabs.TabLayout

class Maths_subjects : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maths_subjects)
        val tabLayout: TabLayout = findViewById(R.id.tabs)

        val viewPager: ViewPager = findViewById(R.id.view_pager)

        val adapter = PagerAdapter.SampleAdapter(supportFragmentManager)

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }
}