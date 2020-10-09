package com.aditya.imscbit.maths

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.aditya.imscbit.physics.*

@Suppress("DEPRECATION")
class PagerAdapter {
    class SampleAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment = when (position) {
            0 -> maths_sem_1.newInstance()
            1 -> maths_sem_2.newInstance()
            2 -> maths_sem_3.newInstance()
            3 -> maths_sem_4.newInstance()
            4 -> maths_sem_5.newInstance()
            5 -> maths_sem_6.newInstance()
            else -> maths_sem_1.newInstance()
        }

        override fun getPageTitle(position: Int): CharSequence? = when (position) {
            0 -> "Sem 1"
            1 -> "Sem 2"
            2 -> "Sem 3"
            3 -> "Sem 4"
            4 -> "Sem 5"
            5 -> "Sem 6"

            else -> ""
        }

        override fun getCount(): Int = 6
    }
}