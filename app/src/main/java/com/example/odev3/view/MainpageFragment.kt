package com.example.odev3.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev3.R
import com.example.odev3.databinding.FragmentMainpageBinding

class MainpageFragment : Fragment() {
    private lateinit var binding: FragmentMainpageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentMainpageBinding.inflate(layoutInflater,container,false)
        binding.mainpageButton.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.mainFragment)
        }


        return binding.root
    }

    }
