package com.example.controledenotas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activityRelatorio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relatorio)

        val pesoTextView = findViewById<TextView>(R.id.peso)
        val alturaTextView = findViewById<TextView>(R.id.altura)
        val situacaoTextView = findViewById<TextView>(R.id.situacao)

        val intent: Intent = getIntent()
        pesoTextView.text = intent.getStringExtra("peso")
        alturaTextView.text = intent.getStringExtra("altura")
        situacaoTextView.text = intent.getStringExtra("situacao")
    }
}