package tn.esprit.trying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.util.Log



class MainActivity4 : AppCompatActivity() {
    lateinit var an : TextView
    lateinit var ana : TextView
    lateinit var anb : TextView
    lateinit var lann : TextView
    lateinit var hobb : TextView
    lateinit var gend : TextView
    lateinit var agee : TextView
    lateinit var name : TextView
    lateinit var email : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        an=findViewById(R.id.android)
        ana=findViewById(R.id.ios)
        anb=findViewById(R.id.flutter)
        lann = findViewById(R.id.lan)
        hobb = findViewById(R.id.hob)
        gend = findViewById(R.id.gen)
        agee = findViewById(R.id.age)
        name = findViewById(R.id.nam)
        email=findViewById(R.id.emai)

        val and = intent.getStringExtra("nz")
        val anaa = intent.getStringExtra("nza")
        val anbb = intent.getStringExtra("nzb")
        val arabe = intent.getStringExtra("aaaa")
        val francais = intent.getStringExtra("fra")
        val anglais = intent.getStringExtra("eng")
        val sport = intent.getStringExtra("spo")
        val music = intent.getStringExtra("mus")
        val game  = intent.getStringExtra("gam")
        val gendre1 = intent.getStringExtra("radd1")
        val gendre2 = intent.getStringExtra("radd2")
        val a4 = intent.getStringExtra("hhh")
        val a44 = intent.getStringExtra("nnn")
        val a444 = intent.getStringExtra("eee")

        Log.d("montassar3" , a4.toString())
        an.text = "AndroidSkill : " + and
        ana.text = "IosSkill : " + anaa
        anb.text = "FlutterSkill : "+ anbb
        lann.text = "Languages : " + arabe +" " + francais + " " + anglais
        hobb.text = "hobbies : " + music + " " + sport + " " + game
        gend.text = "Gender : " + gendre1 + " "+ gendre2
        agee.text = " arge : " + a4
        name.text = "Name : " + a44
        email.text = "Email : " + a444


    }
}