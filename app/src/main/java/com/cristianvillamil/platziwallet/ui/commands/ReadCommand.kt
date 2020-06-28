package com.cristianvillamil.platziwallet.ui.commands

import android.content.Context
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader

class ReadCommand: FileCommand{
    override fun execute(context: Context, filename: String, vararg arguments: String) {
        var fileDtrin = ""
        val inpustStreame =  context.openFileInput(filename)
        val  stingBuilder = StringBuffer()
        val inputStreamReader = InputStreamReader(inpustStreame)
        val bufferedReader = BufferedReader(inputStreamReader)
        bufferedReader.forEachLine { stingBuilder.append("\n").append(it) }
        fileDtrin= stingBuilder.toString()
        Log.e("readerfile",fileDtrin)
    }
}