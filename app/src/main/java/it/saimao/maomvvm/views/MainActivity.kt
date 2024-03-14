package it.saimao.maomvvm.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import it.saimao.maomvvm.R
import it.saimao.maomvvm.databinding.ActivityMainBinding
import it.saimao.maomvvm.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.btAdd.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.etNum2.text.toString().toIntOrNull() ?: 0
            binding.txtResult.text =
                viewModel.calculateSum(num1, num2).sum.toString()
        }
    }
}