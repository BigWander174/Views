package com.example.sibgauviews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.sibgauviews.databinding.MainActivityBinding
import com.example.sibgauviews.databinding.PriceActivityBinding
import com.example.sibgauviews.ui.theme.SibGAUViewsTheme
import com.example.sibgauviews.viewModels.MainViewModel
import com.example.sibgauviews.viewModels.PriceViewModel

class PriceActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this)[PriceViewModel::class.java]
        val binding : PriceActivityBinding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        binding.viewModel = viewModel
    }
}