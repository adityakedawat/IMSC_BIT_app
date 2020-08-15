package com.example.imscbit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }
}