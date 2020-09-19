package com.aditya.imscbit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aditya.imscbit.attendance.Attendance_Calculator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent=Intent(this, Branch::class.java)
        syllabus.setOnClickListener{

            intent.putExtra("gpa",0)
            startActivity(intent)
        }
        gpacalculator.setOnClickListener {

            intent.putExtra("gpa",1)
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
    }
}