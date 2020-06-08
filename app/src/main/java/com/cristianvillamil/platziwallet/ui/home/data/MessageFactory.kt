package com.cristianvillamil.platziwallet.ui.home.data

import android.app.AlertDialog
import android.content.Context

class MessageFactory {
    companion object{
        val TYPE_ERROR : String = "TypeError"
        val TYPE_SUCCSSES : String = "tipySuccsses"
    }
    fun getDialog(context : Context, type : String):AlertDialog.Builder{
        when(type){
            TYPE_ERROR->{
                return AlertDialog.Builder(context)
                    .setMessage("Ocurrio un error al cargar la informacion")
            }
            TYPE_SUCCSSES->{
                return AlertDialog.Builder(context)
                    .setMessage("El contenido fue catrgado con exiso")
            }
        }
        return AlertDialog.Builder(context)
            .setMessage("debe agregar nuevo tipo")
    }
}