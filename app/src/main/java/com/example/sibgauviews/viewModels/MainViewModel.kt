package com.example.sibgauviews.viewModels

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.example.sibgauviews.model.Photo

class MainViewModel : ViewModel() {
    public val album: List<Photo> = listOf(
        Photo("9x12", 100.0),
        Photo("10x15", 150.0),
        Photo("18x24", 300.0)
        )
    var amount:String = ""
    var selectedCost: Double = 0.0;

    fun select(photoId: Int)
    {
        selectedCost = album[photoId].cost
    }
}