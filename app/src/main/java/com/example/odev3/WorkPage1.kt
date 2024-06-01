package com.example.odev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev3.databinding.ActivityWorkPage1Binding

class WorkPage1 : AppCompatActivity() {
    private lateinit var binding: ActivityWorkPage1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityWorkPage1Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}