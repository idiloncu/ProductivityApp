package com.example.odev3.view

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.odev3.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var countDownTimer: CountDownTimer
    private var isTimerRunning = false
    private val startTimeInMillis: Long = 60 * 60 * 1000 // 60 minutes in milliseconds
    private var timeLeftInMillis = startTimeInMillis

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentMainBinding.inflate(inflater,container,false)
        binding.buttonStart.setOnClickListener{
            if (!isTimerRunning) {
                startTimer()
            }
        }
        binding.buttonStop.setOnClickListener {
            stopTimer()
        }
        updateCountDownText()
        return binding.root
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
    }


