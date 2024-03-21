package com.example.standard_week1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val loginBtn = findViewById<Button>(R.id.leftButton)

        loginBtn.setOnClickListener { loginOnClick() }


    }
    fun loginOnClick(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}