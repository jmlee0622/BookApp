package com.example.bookappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

      Handler().postDelayed(Runnable {
          startActivity(Intent(this,MainActivity::class.java))
      },2000)//means 2 seconds
    }
}


