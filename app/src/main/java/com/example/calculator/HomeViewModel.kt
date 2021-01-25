package com.example.calculator

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class HomeViewModel : ViewModel()
{
    val output : MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val input : MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    private  var outputData:String
    private  var inputData:String
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
            "equal" -> onEqualButtonClick()
            else -> buildInput(data)
        }
    }

    private fun backspace()
    {
        inputData = inputData.dropLast(1)
        updateInputData(inputData)
    }

    private fun onEqualButtonClick()
    {
        input.value = output.value
        inputData = output.value.toString()
    }

    private fun buildInput(line:String)
    {
        inputData+=line
        updateInputData(inputData)
    }
    private fun clear()
    {
        inputData = ""
        updateInputData(inputData)
    }

    private fun evaluate():String
    {

        return try {
            val ans = ExpressionBuilder(inputData).build().evaluate()
            ans.toString()
        }catch (e: Exception){
            "Invalid"
        }
    }
    private fun updateInputData(data : String)
    {
        input.value = data
    }
    fun updateOutputData()
    {
        if(inputData.isEmpty())
            output.value = ""
        else
            output.value = evaluate()
    }
}