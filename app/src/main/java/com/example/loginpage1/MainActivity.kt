package com.example.loginpage1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString()
            if (username.isNotEmpty()) {
                Toast.makeText(this, "Toast $username", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Username tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
