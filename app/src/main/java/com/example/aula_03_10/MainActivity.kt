package com.example.aula_03_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnAdd : Button = findViewById(R.id.btnAdd)

        btnAdd.setOnClickListener {
            val etFirstName: EditText = findViewById(R.id.etName)
            val etLastName : EditText = findViewById(R.id.etLastName)

            val tvName : TextView = findViewById(R.id.tvName)
            val tvLastName :  TextView = findViewById(R.id.tvLastName)

            if(etFirstName.text.isBlank() || etLastName.text.isBlank()){
                Toast.makeText(this, "Os campos tem que ser preenchidos", Toast.LENGTH_SHORT).show()
            } else {
                tvName.text = etFirstName.text
                tvLastName.text = etLastName.text
            }
        }
    }
}