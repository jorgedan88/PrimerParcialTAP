package com.example.ppoliverajorgedaniel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    private lateinit var tvnombreDetail: TextView
    private lateinit var tvDificultad: TextView
    private lateinit var ivLogo: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val receta = intent.getParcelableExtra<Receta>("receta")

        tvnombreDetail = findViewById(R.id.tv_nombre_detail)
        tvDificultad = findViewById(R.id.tv_dificultad_detail)
        ivLogo = findViewById(R.id.iv_logo_detail)


        tvnombreDetail.text = receta?.nombre
        tvDificultad.text = receta?.dificultad.toString()

        Glide.with(this).load(receta?.logo).into(ivLogo)
    }
}