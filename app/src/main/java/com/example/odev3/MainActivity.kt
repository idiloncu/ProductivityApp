package com.example.odev3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.navigation.Navigation
import com.example.odev3.databinding.ActivityMainBinding
import com.example.odev3.view.MainFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private var timeLeftInMillis: Long = 60000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun firstFragment(view:View){
            val fragmentManager= supportFragmentManager
            val fragmentTransaction=fragmentManager.beginTransaction()
            val firstFragment = MainFragment()
            fragmentTransaction.replace(R.id.fragmentContainerView,firstFragment).commit()

        }

    }
    fun startTimer() {
            var countDownTimer = object : CountDownTimer(timeLeftInMillis, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    timeLeftInMillis = millisUntilFinished
                    updateTimer()
                }
                override fun onFinish() {

                }
            }.start()
        }
         fun updateTimer() {
            val minutes = (timeLeftInMillis / 1000) / 60
            val seconds = (timeLeftInMillis / 1000) % 60

            val timeFormatted = String.format("%02d:%02d", minutes, seconds)
        }
}