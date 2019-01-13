package com.example.ankitkumarsingh.ivision


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class AboutDevelopers : AppCompatActivity() {
    lateinit var tv_links:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_developers)
        tv_links=findViewById(R.id.tv_links)as TextView
        tv_links.movementMethod=LinkMovementMethod.getInstance()
    }
}
