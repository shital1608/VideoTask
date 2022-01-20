package com.example.videotask.presentation

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * @author shital awathe
 * This is video task application class
 */
@HiltAndroidApp
class VideoTaskApplication: Application() {
    companion object{
        lateinit var context: VideoTaskApplication
    }
    override fun onCreate() {
        super.onCreate()
        context = this
    }
}