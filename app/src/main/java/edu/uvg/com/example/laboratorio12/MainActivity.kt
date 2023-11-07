package edu.uvg.com.example.laboratorio12

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {


    private var peliculas = emptyArray<String>()
    lateinit var arrayAdapter: ArrayAdapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peliculas = arrayOf(
            "Terminator",
            "Avengers",
            "Antman",
            "Soy leyenda",
            "Avatar",
            "It"
        )

        val itemsAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, peliculas)
        val listaPeliculas: ListView = findViewById(R.id.listaPeliculas)
        listaPeliculas.adapter = itemsAdapter


    }
}