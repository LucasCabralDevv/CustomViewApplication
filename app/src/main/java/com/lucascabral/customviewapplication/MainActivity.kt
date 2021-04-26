package com.lucascabral.customviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movie = findViewById<MovieView>(R.id.myMovie)
        movie.setMovie(Movie("AVENGERS 3", "https://movie"))
    }
}