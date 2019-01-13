package com.example.ankitkumarsingh.ivision


import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Welcome : AppCompatActivity()
{
    lateinit var btn_next:Button


    //adding a dialog box ..
    override fun onBackPressed() {

        val builder= AlertDialog.Builder(this)
        builder.setTitle("ARE YOU SURE!!")
        builder.setMessage("DO YOU WANT TO EXIT THE GAME ?")
        builder.setPositiveButton("YES",{ dialogInterface: DialogInterface, i: Int ->
            finish()
        })
        builder.setNegativeButton("NO",{ dialogInterface: DialogInterface, i: Int -> })
        builder.show()
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        btn_next=findViewById(R.id.btn_next)as Button

        btn_next.setOnClickListener(View.OnClickListener
        {
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
            Toast.makeText(this, "ENJOY PLAYING , ALL THE BEST !!!", Toast.LENGTH_LONG).show()
        })

        //added a progress dialog box ...
        val builder= AlertDialog.Builder(this)
        val dialogview= layoutInflater.inflate(R.layout.progress_dialog,null)
        val messg = dialogview.findViewById<TextView>(R.id.tv_progdb)
        messg.text="GAME IS LOADING.....\nPLEASE WAIT ! ! !"
        builder.setView(dialogview)
        builder.setCancelable(false)

        val dialog =builder.create()
        dialog.show()
        android.os.Handler().postDelayed({dialog.dismiss()},5000)
    }
}
