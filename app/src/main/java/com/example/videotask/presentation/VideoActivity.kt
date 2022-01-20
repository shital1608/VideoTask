package com.example.videotask.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.videotask.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}