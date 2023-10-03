package com.example.sibgauviews

import android.content.Intent
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
import com.example.sibgauviews.ui.theme.SibGAUViewsTheme
import com.example.sibgauviews.viewModels.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        val binding : MainActivityBinding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        binding.viewModel = viewModel

        binding.openPriceActivityButton.setOnClickListener()
        {
            val intent = Intent(this, PriceActivity::class.java)
            intent.putExtra("amount", viewModel.amount)
            intent.putExtra("cost", viewModel.selectedCost)
            startActivity(intent)
        }
    }
}