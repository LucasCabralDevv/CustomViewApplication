package com.lucascabral.customviewapplication

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MovieView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val cover: ImageView
    private val titleCover: TextView

    init {
        val view = LayoutInflater
                .from(context)
                .inflate(R.layout.view_movie, this, true)

        cover = view.findViewById(R.id.cover)
        titleCover = view.findViewById(R.id.titleCover)

        orientation = VERTICAL
    }

    fun setMovie(movie: Movie) {
        titleCover.text = movie.title
        //cover.image = movie.cover
    }
}