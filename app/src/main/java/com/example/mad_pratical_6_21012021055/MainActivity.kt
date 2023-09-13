package com.example.mad_pratical_6_21012021055

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val playpause:Button = findViewById(R.id.button2)
        val stop:Button = findViewById(R.id.button3)
        playpause.setOnClickListener{
            playpause()
        }
         stop.setOnClickListener{
             stop()
         }


    }
    fun playpause(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            startService(this)
        }
    }
    fun stop(){
        Intent(applicationContext,MyService::class.java).putExtra(MyService.PLAYERKEY,MyService.PLAYERVALUE).apply {
            startService(this)
        }
    }
}