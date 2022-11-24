package com.example.conveter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.butn)
        val amounte:TextInputEditText=findViewById(R.id.amount_edit)
        val resulte:TextInputEditText=findViewById(R.id.result)

        btn.setOnClickListener {
            val amount = amounte.text.toString().toDouble()
            val resulta = amount.times(10.96)

            resulte.setText(resulta.toString())
        }
    }
}