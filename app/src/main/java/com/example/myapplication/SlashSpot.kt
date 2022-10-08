package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SlashSpot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slashspot)


                Handler(mainLooper).postDelayed({ //This method will be executed once the timer is over
                    // Start your app main activity
                    val i = Intent(this, MainActivity::class.java)
                    startActivity(i)
                    // close this activity
                    finish()
                }, 1500)
            }
        }

