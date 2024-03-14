package it.saimao.maomvvm.viewmodels

import androidx.lifecycle.ViewModel
import it.saimao.maomvvm.models.AddingCalculator

class MainViewModel : ViewModel() {

    fun calculateSum(num1: Int, num2: Int): AddingCalculator =
        AddingCalculator(num1, num2, num1 + num2)

}