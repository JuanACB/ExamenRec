package com.jcab.examenrec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class CotizacionActivity : AppCompatActivity() {
    private lateinit var btnCalcular : Button
    private lateinit var btnLimpiar : Button
    private lateinit var btnRegresar : Button
    private lateinit var txtDescripcion : EditText
    private lateinit var txtValor : EditText
    private lateinit var txtPago : EditText
    private lateinit var rb12 : RadioButton
    private lateinit var rb24 : RadioButton
    private lateinit var rb36 : RadioButton
    private lateinit var rb18 : RadioButton
    private lateinit var lblResultado : TextView
    private lateinit var lblName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cotizacion)

        btnCalcular = findViewById(R.id.btnCalcular)
        btnLimpiar = findViewById(R.id.btnLimpiar)
        btnRegresar = findViewById(R.id.btnRegresar)
        txtDescripcion = findViewById(R.id.txtDescripcion)
        txtValor = findViewById(R.id.txtValor)
        txtPago = findViewById(R.id.txtPago)
        rb12 = findViewById(R.id.rb12)
        rb24 = findViewById(R.id.rb24)
        rb18 = findViewById(R.id.rb18)
        rb36 = findViewById(R.id.rb36)
        lblResultado = findViewById(R.id.lblResultado)
        lblName = findViewById(R.id.lblName)

        lblName.text = lblName.text.toString() + intent.getStringExtra("nombre")
        btnLimpiar.setOnClickListener{
            txtPago.text = null;
            txtValor.text = null;
            txtDescripcion.text = null;
            lblResultado.text = null;
        }

        btnRegresar.setOnClickListener {
            finish()
        }

    }
}