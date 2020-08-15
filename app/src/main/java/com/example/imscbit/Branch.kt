package com.example.imscbit



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_branch.*

class Branch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_branch)

        val flag=intent.getIntExtra("gpa",2)

        physics.setOnClickListener {
            if(flag==0){
            val intent= Intent(this, Subject::class.java)
            startActivity(intent)
        }
            else {
                val intent=Intent(this,GPA_Calculation::class.java)
                startActivity(intent)
            }
        }
    }
}