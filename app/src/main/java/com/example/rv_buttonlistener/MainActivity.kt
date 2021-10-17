package com.example.rv_buttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btn1:Button
    private lateinit var btn2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1=findViewById(R.id.button)
        btn1.setOnClickListener {

            Toast.makeText(this,"CODING",Toast.LENGTH_SHORT).show()
        }
        btn2=findViewById(R.id.button2)
    }

    fun doSome(view: android.view.View) {
        Toast.makeText(this,"CODING",Toast.LENGTH_SHORT).show()

    }
}