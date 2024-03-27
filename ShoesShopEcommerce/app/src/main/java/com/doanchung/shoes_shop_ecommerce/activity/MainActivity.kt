package com.doanchung.shoes_shop_ecommerce.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.doanchung.shoes_shop_ecommerce.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
