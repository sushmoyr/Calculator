package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.calculator.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var fragmentHomeBinding: FragmentHomeBinding?=null
    private val binding get() = fragmentHomeBinding!!

    private val homeViewModel: HomeViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)


        //setup live data
        val valueObserver1 = Observer <String> { newValue->
            binding.tvInput.text = newValue
            homeViewModel.updateOutputData()
        }
        homeViewModel.input.observe(viewLifecycleOwner, valueObserver1)

        val valueObserver2 = Observer <String> { newValue->
            binding.tvOutput.text = newValue
        }
        homeViewModel.output.observe(viewLifecycleOwner, valueObserver2)

        setUpListeners()
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        fragmentHomeBinding = null
    }

    private fun setUpListeners()
    {
        binding.backspace.setOnClickListener {
            homeViewModel.sendData("backspace")
            
        }
        binding.btn0.setOnClickListener {
            homeViewModel.sendData("0")
            
        }
        binding.btn00.setOnClickListener {
            homeViewModel.sendData("00")
            
        }
        binding.btn1.setOnClickListener {
            homeViewModel.sendData("1")
            
        }
        binding.btn2.setOnClickListener {
            homeViewModel.sendData("2")
            
        }
        binding.btn3.setOnClickListener {
            homeViewModel.sendData("3")
            
        }
        binding.btn4.setOnClickListener {
            homeViewModel.sendData("4")
            
        }
        binding.btn5.setOnClickListener {
            homeViewModel.sendData("5")
            
        }
        binding.btn6.setOnClickListener {
            homeViewModel.sendData("6")
            
        }
        binding.btn7.setOnClickListener {
            homeViewModel.sendData("7")
            
        }
        binding.btn8.setOnClickListener {
            homeViewModel.sendData("8")
            
        }
        binding.btn9.setOnClickListener {
            homeViewModel.sendData("9")
            
        }
        binding.btnClear.setOnClickListener {
            homeViewModel.sendData("clear")
            
        }
        binding.btnDivide.setOnClickListener {
            homeViewModel.sendData("/")
            
        }
        binding.btnDot.setOnClickListener {
            homeViewModel.sendData(".")
            
        }
        binding.btnMinus.setOnClickListener {
            homeViewModel.sendData("-")
            
        }
        binding.btnMultiply.setOnClickListener {
            homeViewModel.sendData("*")
            
        }
        binding.btnPlus.setOnClickListener {
            homeViewModel.sendData("+")
            
        }
        binding.mod.setOnClickListener {
            homeViewModel.sendData("%")
            
        }
        binding.btnEqual.setOnClickListener {
            homeViewModel.sendData("equal")
        }
        binding.sine.setOnClickListener {
            homeViewModel.sendData("sin")
            
        }
        binding.cosine.setOnClickListener {
            homeViewModel.sendData("cos")
            
        }
        binding.tan.setOnClickListener {
            homeViewModel.sendData("tan")
            
        }
        binding.log.setOnClickListener {
            homeViewModel.sendData("log")
            
        }
        binding.log10.setOnClickListener {
            homeViewModel.sendData("log10(")
            
        }
        binding.rootx.setOnClickListener {
            homeViewModel.sendData("^0.5")
            
        }
        binding.power.setOnClickListener {
            homeViewModel.sendData("^")
            
        }
        binding.pi.setOnClickListener {
            homeViewModel.sendData("3.1416")
            
        }
        binding.openP.setOnClickListener {
            homeViewModel.sendData("(")
            
        }
        binding.closeP.setOnClickListener {
            homeViewModel.sendData(")")
            
        }


    }
}