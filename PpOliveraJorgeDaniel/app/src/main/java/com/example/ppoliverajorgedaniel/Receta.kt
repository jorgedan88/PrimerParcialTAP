package com.example.ppoliverajorgedaniel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Receta (
    val id:Int,
    val nombre:String,
    val dificultad:Int,
    val pais:Origen,
    val logo:String,
    //val ingredientes: List <Ingredientes>
    val ingredientes: String
): Parcelable

enum class Origen {
    EGIPTO,
    TURQUIA,
    ARABIA,
    LIBANO,
    IRAN,
    AFGANISTAN,
    IRAK
}
/*enum class Ingredientes{
    HARINA, AZUCAR, HUEVO, PIMIENTA, SAL, CARNE_PICADA, GARBANZO
}*/



