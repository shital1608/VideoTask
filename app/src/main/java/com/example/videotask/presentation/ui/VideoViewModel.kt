package com.example.videotask.presentation.ui

import androidx.lifecycle.ViewModel
import com.example.videotask.presentation.VideoTaskApplication
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class VideoViewModel
@Inject
constructor(private val mContext: VideoTaskApplication) : ViewModel() {

    companion object {
        val TAG = VideoViewModel::class.qualifiedName
    }
}