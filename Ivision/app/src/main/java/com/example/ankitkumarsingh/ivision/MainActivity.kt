package com.example.ankitkumarsingh.ivision


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    var counter:Int=1
    var running:Boolean=false
    lateinit var btn_1:Button
    lateinit var btn_2:Button
    lateinit var btn_3:Button
    lateinit var btn_4:Button
    lateinit var btn_5:Button
    lateinit var btn_6:Button
    lateinit var btn_7:Button
    lateinit var btn_8:Button
    lateinit var btn_9:Button
    lateinit var btn_10:Button
    lateinit var btn_11:Button
    lateinit var btn_12:Button
    lateinit var btn_13:Button
    lateinit var btn_14:Button
    lateinit var btn_15:Button
    lateinit var btn_16:Button
    lateinit var btn_17:Button
    lateinit var btn_18:Button
    lateinit var btn_19:Button
    lateinit var btn_20:Button
    lateinit var chrono:Chronometer
    lateinit var btn_results:Button
    lateinit var tv_timer:TextView
    lateinit var btn_reset:Button
    var data:String="00:00"
    var minutes=""
    var seconds=""
    var total_time:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_1 = findViewById(R.id.btn_1)as Button
        btn_2 = findViewById(R.id.btn_2) as Button
        btn_3 = findViewById(R.id.btn_3) as Button
        btn_4 = findViewById(R.id.btn_4) as Button
        btn_5 = findViewById(R.id.btn_5) as Button
        btn_6 = findViewById(R.id.btn_6) as Button
        btn_7 = findViewById(R.id.btn_7) as Button
        btn_8 = findViewById(R.id.btn_8) as Button
        btn_9 = findViewById(R.id.btn_9) as Button
        btn_10 = findViewById(R.id.btn_10) as Button
        btn_11 = findViewById(R.id.btn_11) as Button
        btn_12 = findViewById(R.id.btn_12) as Button
        btn_13 = findViewById(R.id.btn_13) as Button
        btn_14 = findViewById(R.id.btn_14) as Button
        btn_15 = findViewById(R.id.btn_15) as Button
        btn_16 = findViewById(R.id.btn_16) as Button
        btn_17 = findViewById(R.id.btn_17) as Button
        btn_18 = findViewById(R.id.btn_18) as Button
        btn_19 = findViewById(R.id.btn_19) as Button
        btn_20 = findViewById(R.id.btn_20) as Button
        chrono=findViewById(R.id.chrono)as Chronometer
        btn_results=findViewById(R.id.btn_results)as Button
        tv_timer=findViewById(R.id.tv_timer)as TextView
        btn_reset=findViewById(R.id.btn_reset)as Button

        btn_1.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_2.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_3.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_4.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_5.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_6.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_7.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_8.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_9.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_10.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_11.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_12.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_13.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_14.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_15.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_16.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_17.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_18.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_19.setOnClickListener(View.OnClickListener { onClick(it) })
        btn_20.setOnClickListener(View.OnClickListener { onClick(it) })

        btn_2.setOnClickListener(View.OnClickListener {
            if(counter==2) {
                btn_2.text = "31"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()

        })
        btn_3.setOnClickListener(View.OnClickListener {
            if(counter==3) {
                btn_3.text = "33"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_4.setOnClickListener(View.OnClickListener {
            if(counter==4) {
                btn_4.text = "29"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_5.setOnClickListener(View.OnClickListener {
            if(counter==5) {
                btn_5.text = "28"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_6.setOnClickListener(View.OnClickListener {
            if(counter==6) {
                btn_6.text = "25"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_7.setOnClickListener(View.OnClickListener {
            if(counter==7) {
                btn_7.text = "26"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_8.setOnClickListener(View.OnClickListener {
            if(counter==8) {
                btn_8.text = "23"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_9.setOnClickListener(View.OnClickListener {
            if(counter==9) {
                btn_9.text = "34"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_10.setOnClickListener(View.OnClickListener {
            if(counter==10) {
                btn_10.text = "22"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_11.setOnClickListener(View.OnClickListener {
            if(counter==11) {
                btn_11.text = "32"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_12.setOnClickListener(View.OnClickListener {
            if(counter==12) {
                btn_12.text = "37"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_13.setOnClickListener(View.OnClickListener {
            if(counter==13) {
                btn_13.text = "24"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_14.setOnClickListener(View.OnClickListener {
            if(counter==14) {
                btn_14.text = "38"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_15.setOnClickListener(View.OnClickListener {
            if(counter==15) {
                btn_15.text = "39"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_16.setOnClickListener(View.OnClickListener {
            if(counter==16) {
                btn_16.text = "27"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_17.setOnClickListener(View.OnClickListener {
            if(counter==17) {
                btn_17.text = "35"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_18.setOnClickListener(View.OnClickListener {
            if(counter==18) {
                btn_18.text = "21"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_19.setOnClickListener(View.OnClickListener {
            if(counter==19) {
                btn_19.text = "30"
                counter++
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })
        btn_20.setOnClickListener(View.OnClickListener {
            if(counter==20) {
                btn_20.text = "40"
                counter++
                btn_18.setOnClickListener(View.OnClickListener {
                    if (counter == 21) {
                        btn_18.text = "48"
                        counter++
                    } else
                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                })
                btn_10.setOnClickListener(View.OnClickListener {
                    if (counter == 22) {
                        btn_10.text = "41"
                        counter++
                    } else
                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                })
                btn_8.setOnClickListener(View.OnClickListener {
                    if (counter == 23) {
                        btn_8.text = "50"
                        counter++
                    } else
                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                })
                btn_13.setOnClickListener(View.OnClickListener {
                    if (counter == 24) {
                        btn_13.text = "45"
                        counter++
                    } else
                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                })
                btn_6.setOnClickListener(View.OnClickListener {
                    if (counter == 25) {
                        btn_6.text = "46"
                        counter++
                    } else
                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                })
                btn_7.setOnClickListener(View.OnClickListener {
                    if (counter == 26) {
                        btn_7.text = "49"
                        counter++
                    } else
                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                })
                btn_16.setOnClickListener(View.OnClickListener {
                    if (counter == 27) {
                        btn_16.text = "42"
                        counter++
                    } else
                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                })
                btn_5.setOnClickListener(View.OnClickListener {
                    if (counter == 28) {
                        btn_5.text = "44"
                        counter++
                    } else
                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                })
                btn_4.setOnClickListener(View.OnClickListener {
                    if (counter == 29) {
                        btn_4.text = "43"
                        counter++
                    } else
                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                })
                btn_19.setOnClickListener(View.OnClickListener {
                    if (counter == 30) {
                        btn_19.text = "47"
                        counter++
                        btn_2.setOnClickListener(View.OnClickListener {
                            if(counter==31) {
                                counter++
                                btn_2.visibility = (View.INVISIBLE)
                            }
                            else
                                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()

                        })
                        btn_11.setOnClickListener(View.OnClickListener {
                            if(counter==32) {
                                counter++
                                btn_11.visibility = (View.INVISIBLE)
                            }
                            else
                                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                        })
                        btn_3.setOnClickListener(View.OnClickListener {
                            if(counter==33) {
                                counter++
                                btn_3.visibility = (View.INVISIBLE)
                            }
                            else
                                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                        })
                        btn_9.setOnClickListener(View.OnClickListener {
                            if(counter==34) {
                                counter++
                                btn_9.visibility = (View.INVISIBLE)
                            }
                            else
                                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                        })
                        btn_17.setOnClickListener(View.OnClickListener {
                            if(counter==35) {
                                counter++
                                btn_17.visibility = (View.INVISIBLE)
                            }
                            else
                                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                        })
                        btn_1.setOnClickListener(View.OnClickListener {
                            if(counter==36) {
                                counter++
                                btn_1.visibility = (View.INVISIBLE)
                            }
                            else
                                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                        })
                        btn_12.setOnClickListener(View.OnClickListener {
                            if(counter==37) {
                                counter++
                                btn_12.visibility = (View.INVISIBLE)
                            }
                            else
                                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                        })
                        btn_14.setOnClickListener(View.OnClickListener {
                            if(counter==38) {
                                counter++
                                btn_14.visibility = (View.INVISIBLE)
                            }
                            else
                                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                        })
                        btn_15.setOnClickListener(View.OnClickListener {
                            if(counter==39) {
                                counter++
                                btn_15.visibility = (View.INVISIBLE)
                            }
                            else
                                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                        })
                        btn_20.setOnClickListener(View.OnClickListener {
                            if(counter==40) {
                                counter++
                                btn_20.visibility = (View.INVISIBLE)

                                btn_10.setOnClickListener(View.OnClickListener {
                                    if (counter == 41) {
                                        counter++
                                        btn_10.visibility = (View.INVISIBLE)
                                    }
                                    else
                                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                                })
                                btn_16.setOnClickListener(View.OnClickListener {
                                    if (counter == 42) {
                                        counter++
                                        btn_16.visibility = (View.INVISIBLE)
                                    }
                                    else
                                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                                })
                                btn_4.setOnClickListener(View.OnClickListener {
                                    if (counter == 43) {
                                        counter++
                                        btn_4.visibility = (View.INVISIBLE)
                                    }
                                    else
                                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                                })
                                btn_5.setOnClickListener(View.OnClickListener {
                                    if (counter == 44) {
                                        counter++
                                        btn_5.visibility = (View.INVISIBLE)
                                    }
                                    else
                                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                                })
                                btn_13.setOnClickListener(View.OnClickListener {
                                    if (counter == 45) {
                                        counter++
                                        btn_13.visibility = (View.INVISIBLE)
                                    }
                                    else
                                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                                })
                                btn_6.setOnClickListener(View.OnClickListener {
                                    if (counter == 46) {
                                        counter++
                                        btn_6.visibility = (View.INVISIBLE)
                                    }
                                    else
                                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                                })
                                btn_19.setOnClickListener(View.OnClickListener {
                                    if (counter == 47) {
                                        counter++
                                        btn_19.visibility = (View.INVISIBLE)
                                    }
                                    else
                                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                                })
                                btn_18.setOnClickListener(View.OnClickListener {
                                    if (counter == 48) {
                                        counter++
                                        btn_18.visibility = (View.INVISIBLE)
                                    }
                                    else
                                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                                })
                                btn_7.setOnClickListener(View.OnClickListener {
                                    if (counter == 49) {
                                        counter++
                                        btn_7.visibility = (View.INVISIBLE)
                                    }
                                    else
                                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                                })
                                btn_8.setOnClickListener(View.OnClickListener {
                                    if (counter == 50)
                                    {
                                        Toast.makeText(this,"CLICK ON RESULTS TO SEE YOUR SCORE",Toast.LENGTH_LONG).show()
                                        chrono.stop()
                                        data=chrono.text.toString()
                                        btn_8.visibility = (View.INVISIBLE)
                                        tv_timer.text="GAME"
                                        chrono.text="OVER"

                                        minutes=(data.subSequence(0,2)).toString()
                                        seconds =(data.subSequence(3,5)).toString()
                                        var min = minutes.toInt()
                                        var sec=seconds.toInt()
                                        total_time= (min*60) + sec
                                    }
                                })

                            }
                            else
                                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()

                        })

                    }
                    else
                        Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
                })
            }
            else
                Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        })

        btn_results.setOnClickListener(View.OnClickListener
        {

            var i1= Intent(this,Results::class.java)
            i1.putExtra("total_time_taken", total_time)
            startActivity(i1)
        })
        btn_reset.setOnClickListener(View.OnClickListener {
            recreate()
        })

    }


    fun onClick(v:View) {
        if (!running) {
            chrono.base = SystemClock.elapsedRealtime()
            chrono.start()
            running = true
        }
        if (v.id ==(R.id.btn_1)) {

            btn_1.text = "36"
            counter++
        } else {
            Toast.makeText(this, "PLEASE GO IN SEQUENCE !!!!!", Toast.LENGTH_SHORT).show()
        }

    }

}
