package com.example.controledenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private lateinit var pesoEditText: EditText
private lateinit var alturaEditText:EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Definindo uma variável*/
        val calcular = findViewById<Button>(R.id.calcular)
        val sair = findViewById<Button>(R.id.sair)

        calcular.setOnClickListener {
            pesoEditText = findViewById<EditText>(R.id.peso)
            alturaEditText = findViewById<EditText>(R.id.altura)

            val resultado = findViewById<TextView>(R.id.resultado)
            val mensagem = findViewById<TextView>(R.id.message)

            if (validarCampos()){
                val peso = pesoEditText.text.toString().toDouble()
                val altura = alturaEditText.text.toString().toDouble()

                val imc = calcularImc(peso, altura)

                resultado.text = situacaoImc(imc)
            }

            }
        sair.setOnClickListener {
            finish()
        }
    }

    private fun validarCampos(): Boolean{
        var noError = true
        if (pesoEditText.text.isBlank()){
            pesoEditText.setError("Digite seu Peso")
            noError = false
        }
        if(alturaEditText.text.isBlank()){
            alturaEditText.setError("Digite sua Altura")
            noError = false
        }
        return noError
    }

}