package com.example.rv_buttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btn1:Button
    private lateinit var btn2:Button
    private lateinit var tv:TextView
    private lateinit var ed:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv=findViewById(R.id.tv)
        ed=findViewById(R.id.ed)
        btn1=findViewById(R.id.button)

        btn1.setOnClickListener {
            val name = ed.text.toString()
            tv.text=name
            ed.text.clear()
            Toast.makeText(this,"CODING $name Kotlin",Toast.LENGTH_SHORT).show()
        }
        btn2=findViewById(R.id.button2)
    }

    fun doSome(view: android.view.View) {
        val name = ed.text.toString()
        tv.text=name
        ed.text.clear()
        Toast.makeText(this,"CODING $name XML",Toast.LENGTH_SHORT).show()

    }
}
