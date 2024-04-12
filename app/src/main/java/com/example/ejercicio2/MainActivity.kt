package com.example.ejercicio2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Primero seleccionamos el botón o lo que sea que cambiará la página

        //Utilizamos findViewById para obtener el elemento mediante su identificador o "id"
        val btnSiguiente = findViewById<Button>(R.id.button)

        //Como siguiente paso debemos utilizar un evento, el cuál estára atenteo al momento en el que el elemento sea seleccionado.
        btnSiguiente.setOnClickListener{

            //Utilizamos la clase "intent" la cual nos ayuda en el intercambio de información entre componentes.
            //Esta clase nos va a pedir dos parametros, uno es el contexto o el lugar en el que va a funcionar y el otro es el lugar hacia donde va dirigido o intercambiará información
            val intent = Intent(this, Actividad2::class.java)

            //Iniciamos la clase intent
            startActivity(intent)
        }
    }
}