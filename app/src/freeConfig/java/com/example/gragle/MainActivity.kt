package com.example.gragle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gragle.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = BuildConfig.MY_KEY
    }
}