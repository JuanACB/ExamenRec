package com.jcab.examenrec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btnCotizar : Button;
    private  lateinit var txtName : EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCotizar = findViewById(R.id.btnCotizar)
        txtName = findViewById(R.id.txtName)

        btnCotizar.setOnClickListener {
            if (txtName.text.toString() == "") {
                Toast.makeText(this, "Favor de ingresar un nombre", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(
                    Intent(this, CotizacionActivity::class.java)
                        .putExtra("nombre", txtName.text.toString())
                )
            }
        }
    }
}