package com.example.odev3.view

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
//import com.example.odev3.databinding.ActivityWorkPage1Binding

class WorkPage1 : Fragment() {
  /*  private lateinit var binding:
    private lateinit var countDownTimer: CountDownTimer
    private var isTimerRunning = false
    private val startTimeInMillis: Long = 60 * 60 * 1000 // 60 minutes in milliseconds
    private var timeLeftInMillis = startTimeInMillis

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityWorkPage1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonStart.setOnClickListener{
            if (!isTimerRunning) {
                startTimer()
            }
        }

        binding.buttonStop.setOnClickListener {
            stopTimer()
        }

        updateCountDownText()
    }
    private fun startTimer() {
        countDownTimer = object : CountDownTimer(timeLeftInMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeLeftInMillis = millisUntilFinished
                updateCountDownText()
            }

            override fun onFinish() {
                isTimerRunning = false
                updateCountDownText()
            }
        }.start()

        isTimerRunning = true
    }

    private fun stopTimer() {
        countDownTimer.cancel()
        isTimerRunning = false
    }

    private fun updateCountDownText() {
        val minutes = (timeLeftInMillis / 1000) / 60
        val seconds = (timeLeftInMillis / 1000) % 60
        val timeFormatted = String.format("%02d:%02d", minutes, seconds)
        binding.kronometer.text = timeFormatted
    }
*/
        }


