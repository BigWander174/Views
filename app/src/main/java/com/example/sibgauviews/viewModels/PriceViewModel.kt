package com.example.sibgauviews.viewModels

import androidx.databinding.ObservableDouble
import androidx.lifecycle.ViewModel
import kotlin.math.cos

class PriceViewModel: ViewModel() {

    public val price = ObservableDouble(0.0)

    fun setPrice(amount: String, cost:Double)
    {
        var totalAmount: Int = amount.toInt()
        price.set(totalAmount * cost)
    }

}