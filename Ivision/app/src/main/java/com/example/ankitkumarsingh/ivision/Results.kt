package com.example.ankitkumarsingh.ivision

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_results.*

@Suppress("DEPRECATION")
class Results : AppCompatActivity()
{
    var data_recieved:String=""
    var tot_time:Int=0

    lateinit var bnt_aboutme:Button
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
        tv_thank.setSingleLine()
        tv_thank.isSelected=true
        tv_thank.text="ENJOY PLAYING , THANK YOU ! ! !"


        bnt_aboutme=findViewById(R.id.btn_aboutme)as Button

        tv_results.findViewById<TextView>(R.id.tv_results)
        tv_message.findViewById<TextView>(R.id.tv_message)

        tot_time=intent.getIntExtra("total_time_taken",0)

        data_recieved="TIME TAKEN => "+"<font color=\"#3300FF\"><bold>"+tot_time+"</bold></font>"+" Seconds"
        tv_results.text=data_recieved
        tv_results.setText(Html.fromHtml(data_recieved))


        btn_aboutme.setOnClickListener(View.OnClickListener {
            var i2= Intent(this,AboutDevelopers::class.java)
            startActivity(i2)
        })

        if(tot_time==0)
            tv_message.text="FIRST ,PLAY AND COMPLETE THE GAME !!!!"
        else if(tot_time>0 && tot_time<=40)
            tv_message.text="EXCELLENT !!!! , YOU HAVE A SHARP EYE , AND A GOOD VISUAL POWER."
        else if(tot_time>40 && tot_time<=60)
            tv_message.text="GOOD VISUAL POWER!!!! ,BUT YOU CAN TRAIN YOUR BRAIN , TO DO BETTER."
        else if(tot_time>60 && tot_time<=80)
            tv_message.text="AVERAGE !!!! , BUT YOU HAVE TO IMPROVE YOUR VISUAL POWER."
        else if(tot_time>80 )
            tv_message.text="SORRY !!!! , YOU SERIOUSLY NEED AN EYE CHECKUP."
    }
}
