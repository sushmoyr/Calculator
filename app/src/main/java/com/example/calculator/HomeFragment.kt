package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
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
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btn0.setOnClickListener {
            homeViewModel.sendData("0")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btn00.setOnClickListener {
            homeViewModel.sendData("00")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btn1.setOnClickListener {
            homeViewModel.sendData("1")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btn2.setOnClickListener {
            homeViewModel.sendData("2")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btn3.setOnClickListener {
            homeViewModel.sendData("3")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btn4.setOnClickListener {
            homeViewModel.sendData("4")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btn5.setOnClickListener {
            homeViewModel.sendData("5")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btn6.setOnClickListener {
            homeViewModel.sendData("6")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btn7.setOnClickListener {
            homeViewModel.sendData("7")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btn8.setOnClickListener {
            homeViewModel.sendData("8")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btn9.setOnClickListener {
            homeViewModel.sendData("9")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btnClear.setOnClickListener {
            homeViewModel.sendData("clear")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btnDivide.setOnClickListener {
            homeViewModel.sendData("/")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btnDot.setOnClickListener {
            homeViewModel.sendData(".")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btnMinus.setOnClickListener {
            homeViewModel.sendData("-")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btnMultiply.setOnClickListener {
            homeViewModel.sendData("*")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btnPlus.setOnClickListener {
            homeViewModel.sendData("+")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.mod.setOnClickListener {
            homeViewModel.sendData("%")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.btnEqual.setOnClickListener {
            binding.tvOutput.text = homeViewModel.getOutputData()
        }
        binding.sine.setOnClickListener {
            homeViewModel.sendData("sin")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.cosine.setOnClickListener {
            homeViewModel.sendData("cos")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.tan.setOnClickListener {
            homeViewModel.sendData("tan")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.log.setOnClickListener {
            homeViewModel.sendData("log")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.log10.setOnClickListener {
            homeViewModel.sendData("log10")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.rootx.setOnClickListener {
            homeViewModel.sendData("root")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.power.setOnClickListener {
            homeViewModel.sendData("^")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.pi.setOnClickListener {
            homeViewModel.sendData("3.1416")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.openP.setOnClickListener {
            homeViewModel.sendData("(")
            binding.tvInput.text = homeViewModel.getInputData()
        }
        binding.closeP.setOnClickListener {
            homeViewModel.sendData(")")
            binding.tvInput.text = homeViewModel.getInputData()
        }


    }
}