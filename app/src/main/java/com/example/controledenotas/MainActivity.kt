package com.example.controledenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Definindo uma variável*/
        val calcular = findViewById<Button>(R.id.calcular)
        val sair = findViewById<Button>(R.id.sair)

        calcular.setOnClickListener {
            val peso = findViewById<EditText>(R.id.peso).text.toString().toDouble()
            val altura = findViewById<EditText>(R.id.altura).text.toString().toDouble()
            val resultado = findViewById<TextView>(R.id.resultado)
            val mensagem = findViewById<TextView>(R.id.message)

            val imc = peso / (altura * altura) ;

            if (imc < 18.5) {
                mensagem.text = "Seu IMC é:"
                resultado.text = "${imc}"
                resultado.setTextColor(Color.GREEN)
            } else if (imc < 25) {
                mensagem.text = "Seu IMC é:"
                resultado.text = "${imc}"
                resultado.setTextColor(Color.GREEN)
            } else if(imc < 30){
                mensagem.text = "Seu IMC é:"
                resultado.text = "${imc}"
            } else if(imc < 35){
                mensagem.text = "Seu IMC é:"
                resultado.text = "${imc}"
            } else if(imc < 40){
                mensagem.text = "Seu IMC é:"
                resultado.text = "${imc}"
            } else if(imc < 45){
                mensagem.text = "Seu IMC é:"
                resultado.text = "${imc}"
            } else{
                mensagem.text = "Seu IMC é:"
                resultado.text = "${imc}"
                resultado.setTextColor(Color.RED)
            }

            sair.setOnClickListener {
                finish()
            }
        }
    }
}