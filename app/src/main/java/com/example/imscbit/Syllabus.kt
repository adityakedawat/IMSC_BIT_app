package com.example.imscbit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView

class Syllabus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_syllabus)
        val modules=intent.getStringArrayExtra("modules")
        val books=intent.getStringArrayExtra("books")
        var j=0
        val textviewarray= arrayOf(R.id.textView1,R.id.textView2,R.id.textView3,R.id.textView4,R.id.textView5,R.id.textView6,R.id.textView7)
        for (i in modules!!){
            findViewById<TextView>(textviewarray[j]).append("\n$i")
            j += 1
        }
        for (i in books!!){
            findViewById<TextView>(textviewarray[j]).append("\n$i")
            j += 1
        }
    }
}