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
            val nota1 = findViewById<EditText>(R.id.nota1).text.toString().toInt()
            val nota2 = findViewById<EditText>(R.id.nota2).text.toString().toInt()
            val resultado = findViewById<TextView>(R.id.resultado)
            val notaTotal = findViewById<TextView>(R.id.media)
            val notas = findViewById<TextView>(R.id.notas)

            val media = (nota1 + nota2) / 2;

            if (media >= 5) {
                notas.text = "Nota 1° Semestre ${nota1} \n Nota 2° Semestre ${nota2} \n"
                resultado.text = "Aprovado"
                notaTotal.text = "Sua Média ${media}"
                resultado.setTextColor(Color.GREEN)
            } else {
                notas.text = "Nota 1° Semestre ${nota1} \n Nota 2° Semestre ${nota2} \n"
                resultado.text = "Reprovado"
                notaTotal.text = "Sua Média: ${media}"
                resultado.setTextColor(Color.RED)
            }

            sair.setOnClickListener {
                finish()
            }
        }
    }
}