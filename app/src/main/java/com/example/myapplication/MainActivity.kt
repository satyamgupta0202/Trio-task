package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.net.URI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val task = findViewById<EditText>(R.id.task)
        val email = findViewById<Button>(R.id.mail)
        val phone = findViewById<Button>(R.id.phone)
        val search = findViewById<Button>(R.id.search)

        email.setOnClickListener{
            val work = task.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_SENDTO
            i.data = Uri.parse("mailto:$work")
            i.putExtra(Intent.EXTRA_SUBJECT , "Implicit_Intent")
            startActivity(i)
        }



        search.setOnClickListener{
            val address = task.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("http://$address")
           // i.putExtra(Intent.EXTRA_SUBJECT , "Implicit_Intent")
            startActivity(i)
        }

        phone.setOnClickListener{
            val phone = task.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:$phone")
            // i.putExtra(Intent.EXTRA_SUBJECT , "Implicit_Intent")
            startActivity(i)
        }
    }
}