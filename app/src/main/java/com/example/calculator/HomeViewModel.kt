package com.example.calculator

import android.os.Debug
import android.util.Log
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel()
{
    private lateinit var outputData:String
    private lateinit var inputData:String
    init {
        outputData = ""
        inputData = ""
    }
    fun sendData(data:String)
    {
        when(data)
        {
            "clear" -> clear()
            "backspace" -> backspace()
            else -> buildInput(data)
        }
    }

    private fun backspace()
    {
        inputData = inputData.dropLast(1)
        Log.d("Backspace called", inputData)
    }

    private fun buildInput(line:String)
    {
        inputData+=line
        Log.d("input", inputData)
    }
    private fun clear()
    {
        inputData = ""
        outputData = ""
    }
    public fun getInputData():String
    {
        return inputData
    }
    public fun getOutputData():String
    {
        outputData = inputData.length.toString()
        return outputData
    }
}