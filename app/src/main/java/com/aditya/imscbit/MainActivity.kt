package com.aditya.imscbit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.content.ContextCompat
import com.aditya.imscbit.attendance.Attendance_Calculator
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent=Intent(this, Branch::class.java)
        syllabus.setOnClickListener{

            intent.putExtra("gpa", 0)
            startActivity(intent)
        }
        gpacalculator.setOnClickListener {

            intent.putExtra("gpa", 1)
            startActivity(intent)
        }
        attendancecalculator.setOnClickListener {
            val attendanceintent=Intent(this, Attendance_Calculator::class.java)
            startActivity(attendanceintent)
        }
        about_us_button.setOnClickListener {
            val aboutusintent=Intent(this, Aboutus::class.java)
            startActivity(aboutusintent)
        }
        erp.setOnClickListener {
            val url="https://erp.bitmesra.ac.in/"
            val builder = CustomTabsIntent.Builder()
// set toolbar color and/or setting custom actions before invoking build()
// Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
// set toolbar color and/or setting custom actions before invoking build()
// Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            val customTabsIntent = builder.build()
            builder.setToolbarColor(ContextCompat.getColor(this, R.color.appbarcolor))
// and launch the desired Url with CustomTabsIntent.launchUrl()
// and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url))

        }
        placement.setOnClickListener {
            val url="http://placement.bitmesra.ac.in/"
            val builder = CustomTabsIntent.Builder()
// set toolbar color and/or setting custom actions before invoking build()
// Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
// set toolbar color and/or setting custom actions before invoking build()
// Once ready, call CustomTabsIntent.Builder.build() to create a CustomTabsIntent
            val customTabsIntent = builder.build()
            builder.setToolbarColor(ContextCompat.getColor(this, R.color.appbarcolor))
// and launch the desired Url with CustomTabsIntent.launchUrl()
// and launch the desired Url with CustomTabsIntent.launchUrl()
            customTabsIntent.launchUrl(this, Uri.parse(url))

        }
    }
}