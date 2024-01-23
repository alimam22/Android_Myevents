package com.example.myevs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myevs.databinding.ActivityDetalhesEventoBinding

class DetalhesEventoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalhesEventoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesEventoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = this.intent
        if (intent != null) {
            val name = intent.getStringExtra("title")
        }
    }
}