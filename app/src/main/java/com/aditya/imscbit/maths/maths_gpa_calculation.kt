package com.aditya.imscbit.maths

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.aditya.imscbit.R
import kotlinx.android.synthetic.main.activity_maths_gpa_calculation.*
import java.math.BigDecimal
import java.math.RoundingMode

val sems= arrayOf(1,2,3,4,5,6)
var totalsem=0
class maths_gpa_calculation : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maths_gpa_calculation)
        val spinner: Spinner =findViewById<Spinner>(R.id.mspinner)

        spinner.setOnItemSelectedListener(this)

        // Create an ArrayAdapter using a simple spinner layout and sems array
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item,
            com.aditya.imscbit.maths.sems
        )
        // Set layout to use when the list of choices appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Set Adapter to Spinner
        spinner.setAdapter(aa)
        val btn=findViewById<Button>(R.id.mgpacalculate)
        val totalcredits= arrayOf(21.5,26.0,24.0,23.0,24.0,25.5)
        btn.setOnClickListener {
            try {
                val gparray= arrayOf<Double>(0.0,0.0,0.0,0.0,0.0,0.0)
                val t1=mcgsem1.text.toString()



                if(com.aditya.imscbit.maths.totalsem >=1 && t1!=null){
                    gparray[0]=t1.toDouble()
                }
                val t2=mcgsem2.text.toString()
                if(com.aditya.imscbit.maths.totalsem >=2 && t2!=null){
                    gparray[1]=t2.toDouble()}
                val t3=mcgsem3.text.toString()
                if(com.aditya.imscbit.maths.totalsem >=3 && t3!=null){
                    gparray[2]=t3.toDouble()}
                val t4=mcgsem4.text.toString()
                if(com.aditya.imscbit.maths.totalsem >=4 && t4!=null){
                    gparray[3]=t4.toDouble()}
                val t5=mcgsem5.text.toString()
                if(com.aditya.imscbit.maths.totalsem >=5 && t5!=null){
                    gparray[4]=t5.toDouble()}
                val t6=mcgsem6.text.toString()
                if(com.aditya.imscbit.maths.totalsem >=6 && t6!=null){
                    gparray[5]=t6.toDouble()}
//            for(i in 0..5){
//                if(gparray[i]==null)
//                    gparray[i]=0.0


                val cgpa= BigDecimal(findcgpa(gparray,
                    com.aditya.imscbit.maths.totalsem,totalcredits)).setScale(2, RoundingMode.HALF_EVEN)
                val tx=findViewById<TextView>(R.id.mcgpa)
                tx.visibility=View.VISIBLE

                tx.text = "CGPA: $cgpa"
            }
            catch (e: NumberFormatException){
                Toast.makeText(applicationContext,"Please Type Your GPA", Toast.LENGTH_SHORT).show()
            }

        }}

    private fun findcgpa(gparray: Array<Double>, totalsem: Int, credits: Array<Double>): Double {
        try {

            var cgpa:Double=0.0
            var totalcredits=0.0
            for(i in 0 until totalsem){
                cgpa += credits[i] * gparray[i]
                totalcredits += credits[i]
            }
            cgpa /= totalcredits

            return cgpa
        }
        catch (e: NumberFormatException){
            Toast.makeText(applicationContext,"Please Type Your GPA", Toast.LENGTH_SHORT).show()
            return 0.0
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        Toast.makeText(applicationContext, "Please select the No. of Semesters.", Toast.LENGTH_SHORT).show()
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {


        val sem1: EditText =findViewById<EditText>(R.id.mcgsem1)
        val sem2: EditText =findViewById<EditText>(R.id.mcgsem2)
        val sem3: EditText =findViewById<EditText>(R.id.mcgsem3)
        val sem4: EditText =findViewById<EditText>(R.id.mcgsem4)
        val sem5: EditText =findViewById<EditText>(R.id.mcgsem5)
        val sem6: EditText =findViewById<EditText>(R.id.mcgsem6)
        val btn=findViewById<Button>(R.id.mgpacalculate)
        //println(sems[p2])
        when(p2){
            0->{
                sem1.visibility=View.VISIBLE
                sem2.visibility=View.INVISIBLE
                sem3.visibility=View.INVISIBLE
                sem4.visibility=View.INVISIBLE
                sem5.visibility=View.INVISIBLE
                sem6.visibility=View.INVISIBLE
                btn.visibility=View.VISIBLE
                totalsem =1
            }
            1->{sem1.visibility=View.VISIBLE
                sem2.visibility=View.VISIBLE
                sem3.visibility=View.INVISIBLE
                sem4.visibility=View.INVISIBLE
                sem5.visibility=View.INVISIBLE
                sem6.visibility=View.INVISIBLE
                btn.visibility=View.VISIBLE
                totalsem =2
            }
            2->{sem1.visibility=View.VISIBLE
                sem2.visibility=View.VISIBLE
                sem3.visibility=View.VISIBLE
                sem4.visibility=View.INVISIBLE
                sem5.visibility=View.INVISIBLE
                sem6.visibility=View.INVISIBLE
                btn.visibility=View.VISIBLE
                totalsem =3}
            3->{sem1.visibility=View.VISIBLE
                sem2.visibility=View.VISIBLE
                sem3.visibility=View.VISIBLE
                sem4.visibility=View.VISIBLE
                sem5.visibility=View.INVISIBLE
                sem6.visibility=View.INVISIBLE
                btn.visibility=View.VISIBLE
                totalsem =4
            }
            4->{sem1.visibility=View.VISIBLE
                sem2.visibility=View.VISIBLE
                sem3.visibility=View.VISIBLE
                sem4.visibility=View.VISIBLE
                sem5.visibility=View.VISIBLE
                sem6.visibility=View.INVISIBLE
                btn.visibility=View.VISIBLE
                totalsem =5
            }
            5->{sem1.visibility= View.VISIBLE
                sem2.visibility=View.VISIBLE
                sem3.visibility=View.VISIBLE
                sem4.visibility=View.VISIBLE
                sem5.visibility=View.VISIBLE
                sem6.visibility=View.VISIBLE
                btn.visibility=View.VISIBLE
                totalsem =6
            }
        }
    }
}