package com.example.odev3.view

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.odev3.R
import com.example.odev3.databinding.ActivityUserActiviityBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class UserActiviity : AppCompatActivity() {
    private lateinit var binding: ActivityUserActiviityBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUserActiviityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth= Firebase.auth


    }
    fun signinClicked(view: View){

    }
    fun signupClicked(view: View){
        val email=binding.editTextEmail.text.toString()
        val password=binding.editTextPassword.toString()

        if (email.equals("") || password.equals("")){
            binding.editTextEmail.setBackgroundColor(Color.RED)
            binding.editTextPassword.setBackgroundColor(Color.RED)
        }
        else{
            auth.createUserWithEmailAndPassword(email,password).addOnSuccessListener {
                val intent = Intent(this,MainFragment::class.java)
                startActivity(intent)
                finish()

            }.addOnFailureListener{
                Toast.makeText(this,it.localizedMessage,Toast.LENGTH_LONG).show()

                binding.editTextEmail.setBackgroundColor(Color.RED)
                binding.editTextPassword.setBackgroundColor(Color.RED)

            }
        }
    }

}