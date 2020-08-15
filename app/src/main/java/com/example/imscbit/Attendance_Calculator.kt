package com.example.imscbit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_g_p_a__calculation.*
import java.lang.NumberFormatException
import java.math.BigDecimal
import java.math.RoundingMode

class Attendance_Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attendance__calculator)
        val bt=findViewById<Button>(R.id.attendacecalculate)
        bt.setOnClickListener {
            try {
                val et1=findViewById<EditText>(R.id.attended)
                val et2=findViewById<EditText>(R.id.total)
                val anst1=findViewById<TextView>(R.id.attendance)
                val anst2=findViewById<TextView>(R.id.rattendance)
                val anst3=findViewById<TextView>(R.id.rattendance2)
                val tt1=et1.text.toString().toFloat()
                val tt2=et2.text.toString().toFloat()
                val percentt= (((tt1/tt2)*100))

                if(percentt<65.0){
                    anst1.visibility=View.VISIBLE
                    anst1.text="Your Attendance is $percentt."
                    var t1=tt1
                    var t2=tt2
                    var c=0
                    var percent=percentt

                    while(percent<65){
                        t1 += 1
                        t2 += 1
                        c++
                        percent=(t1/t2)*100


                    }
                    val remaining65=(c)
                    t1=tt1
                    t2=tt2
                    c=0
                    percent=percentt
                    while(percent<75){
                        t1 += 1
                        t2 += 1
                        c++
                        percent=(t1/t2)*100


                    }
                    val remaining=(c)
                    anst2.visibility=View.VISIBLE
                    anst2.text="You need to attend $remaining more classes to attain 75% attendance."
                    anst3.visibility=View.VISIBLE
                    anst3.text="You need to attend $remaining65 more classes to attain 65% attendance."
                }


                else if(percentt<75.0 && percentt>=65.0){
                    anst1.visibility=View.VISIBLE
                    anst3.visibility=View.INVISIBLE
                    anst1.text="Your Attendance is $percentt."
                    var t1=tt1
                    var t2=tt2
                    var c=0
                    var percent=percentt
                    while(percent<75){
                        t1 += 1
                        t2 += 1
                        c++
                        percent=(t1/t2)*100
                    }
                    val remaining=(c)
                    anst2.visibility=View.VISIBLE
                    anst2.text="You need to attend $remaining more classes to attain 75% attendance."
                }
                else if(percentt>=75){

                    var percent=percentt
            anst1.visibility=View.VISIBLE
                    anst2.visibility=View.INVISIBLE
                    anst3.visibility=View.INVISIBLE
            anst1.text="Your Attendance is $percent."
            }}
            catch (e: NumberFormatException){
                Toast.makeText(applicationContext,"Please Type A Valid No.", Toast.LENGTH_SHORT).show()
            }

        }
    }

}