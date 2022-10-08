package tn.esprit.trying

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.SeekBar
import android.widget.Toast
import android.util.Log

class MainActivity3 : AppCompatActivity() {
    lateinit var b : Button
    lateinit var s1 : SeekBar
    lateinit var s2 : SeekBar
    lateinit var s3 : SeekBar
    lateinit var caa : CheckBox
    lateinit var cff : CheckBox
    lateinit var cee : CheckBox
    lateinit var cmm : CheckBox
    lateinit var css : CheckBox
    lateinit var cgg : CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        s1 = findViewById(R.id.sb1)
        s2 = findViewById(R.id.sb2)
        s3 = findViewById(R.id.sb3)
        caa = findViewById(R.id.ca)
        cff = findViewById(R.id.cf)
        cee = findViewById(R.id.ce)
        cmm = findViewById(R.id.cm)
        css = findViewById(R.id.cs)
        cgg = findViewById(R.id.cg)



        val seek = findViewById<SeekBar>(R.id.sb1)
        seek?.setOnSeekBarChangeListener(object :  SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //val aa = seek.progress
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })

        val seek2 = findViewById<SeekBar>(R.id.sb2)
        seek2?.setOnSeekBarChangeListener(object :  SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //val bb = seek2.progress
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })

        val seek3 = findViewById<SeekBar>(R.id.sb3)
        seek3?.setOnSeekBarChangeListener(object :  SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //val cc = seek3.progress
            }
            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })



        b= findViewById(R.id.submit)
        b.setOnClickListener(){

            var i = Intent(this,MainActivity4::class.java)


            val gend1 = intent.getStringExtra("rad1")
            val gend2 = intent.getStringExtra("rad2")
            val a3 = intent.getStringExtra("hhh")
            val a33 = intent.getStringExtra("nnn")
            val a333 = intent.getStringExtra("eee")
            //Log.d("monta" , a3.toString())
            i.putExtra("radd1" , gend1)
            i.putExtra("radd2",gend2)
            i.putExtra("hhh",a3.toString())
            i.putExtra("nnn",a33.toString())
            i.putExtra("eee",a333.toString())


            if (caa.isChecked){
            i.putExtra("aaaa", "Arabic")
            }
            else {
                i.putExtra("aaaa", " ")
            }
            if (cff.isChecked){
            i.putExtra("fra","Francais")
        }
            else {
                i.putExtra("fra", " ")
            }
            if (cee.isChecked){
            i.putExtra("eng","English")
        }            else {
                i.putExtra("eng", " ")
            }
            if (cmm.isChecked){
            i.putExtra("mus","Music")
        }            else {
                i.putExtra("mus", " ")
            }
            if (css.isChecked){
            i.putExtra("spo","Sport")
        }            else {
                i.putExtra("spo", " ")
            }
            if (cgg.isChecked){
            i.putExtra("gam","Games")
        }            else {
                i.putExtra("gam", " ")
            }

                i.putExtra("nz"," " + seek.progress.toFloat())
                i.putExtra("nza"," " + seek2.progress.toFloat())
                i.putExtra("nzb"," " + seek3.progress.toFloat())



            startActivity(i)
        }
    }
}


