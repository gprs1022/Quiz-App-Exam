package com.example.examapp

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.example.examapp.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_home)

        supportActionBar?.hide()

        val qusbutton1 = findViewById<Button>(R.id.btn1)
        val qusbutton2 = findViewById<Button>(R.id.btn2)
        val qusbutton3 = findViewById<Button>(R.id.btn3)
        val qusbutton4 = findViewById<Button>(R.id.btn4)
        val qusbutton5 = findViewById<Button>(R.id.btn5)
        val qusbutton6 = findViewById<Button>(R.id.btn6)


       qusbutton1.setOnClickListener {

           val option = arrayOf("an operating system", "an operating system", "a web server")
           val builder3 = AlertDialog.Builder( this)
           builder3.setTitle("1) Android is -")
           builder3.setMultiChoiceItems (option, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->


           })



           builder3.setPositiveButton( "Submit", DialogInterface.OnClickListener { dialogInterface, à ->
// What action should be performed when Yes is clicked?

           })
           builder3.setNegativeButton( "Decline", DialogInterface.OnClickListener { dialogInterface, à ->


           })
           builder3.show()


       }
        qusbutton2.setOnClickListener {

            val option = arrayOf("OSS", "Apache/MIT", "Sourceforge")
            val builder3 = AlertDialog.Builder( this)
            builder3.setTitle("2) Under which of the following Android is licensed?")
            builder3.setMultiChoiceItems (option, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->


            })



            builder3.setPositiveButton( "Submit", DialogInterface.OnClickListener { dialogInterface, à ->
// What action should be performed when Yes is clicked?

            })
            builder3.setNegativeButton( "Decline", DialogInterface.OnClickListener { dialogInterface, à ->


            })
            builder3.show()


        }

        qusbutton3.setOnClickListener {

            val option = arrayOf("Android Phone kit", "Android Page kit", "Android Package Kit")
            val builder3 = AlertDialog.Builder( this)
            builder3.setTitle("3) APK stands for -")
            builder3.setMultiChoiceItems (option, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->


            })



            builder3.setPositiveButton( "Submit", DialogInterface.OnClickListener { dialogInterface, à ->
// What action should be performed when Yes is clicked?

            })
            builder3.setNegativeButton( "Decline", DialogInterface.OnClickListener { dialogInterface, à ->


            })
            builder3.show()


        }

        qusbutton4.setOnClickListener {

            val option = arrayOf("Desktops", "Mobile Device", "T - Mobile G1")
            val builder3 = AlertDialog.Builder( this)
            builder3.setTitle("For which of the following Android is mainly developed?")
            builder3.setMultiChoiceItems (option, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->


            })



            builder3.setPositiveButton( "Submit", DialogInterface.OnClickListener { dialogInterface, à ->
// What action should be performed when Yes is clicked?

            })
            builder3.setNegativeButton( "Decline", DialogInterface.OnClickListener { dialogInterface, à ->


            })
            builder3.show()


        }

        qusbutton5.setOnClickListener {

            val option = arrayOf("JVM", "Dalvik virtual machine", "Simple virtual machine")
            val builder3 = AlertDialog.Builder( this)
            builder3.setTitle("5) Which of the following virtual machine is used by the Android operating system?")
            builder3.setMultiChoiceItems (option, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->


            })



            builder3.setPositiveButton( "Submit", DialogInterface.OnClickListener { dialogInterface, à ->
// What action should be performed when Yes is clicked?

            })
            builder3.setNegativeButton( "Decline", DialogInterface.OnClickListener { dialogInterface, à ->


            })
            builder3.show()


        }
        qusbutton6.setOnClickListener {

            val option = arrayOf("Java", "C++", "C")
            val builder3 = AlertDialog.Builder( this)
            builder3.setTitle("6) Android is based on which of the following language?")
            builder3.setMultiChoiceItems (option, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->


            })



            builder3.setPositiveButton( "Submit", DialogInterface.OnClickListener { dialogInterface, à ->
// What action should be performed when Yes is clicked?

            })
            builder3.setNegativeButton( "Decline", DialogInterface.OnClickListener { dialogInterface, à ->


            })
            builder3.show()


        }







    }
}