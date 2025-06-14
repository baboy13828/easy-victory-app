package com.rudy.easyvictory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rudy.easyvictory.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var winCount = 0
    private var loseCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateScore()

        binding.btnWin.setOnClickListener {
            winCount++
            updateScore()
        }

        binding.btnLose.setOnClickListener {
            loseCount++
            updateScore()
        }

        binding.btnVerify.setOnClickListener {
            // Premium sudah gratis
        }
    }

    private fun updateScore() {
        binding.txtScore.text = "Menang: $winCount | Kalah: $loseCount"
    }
}