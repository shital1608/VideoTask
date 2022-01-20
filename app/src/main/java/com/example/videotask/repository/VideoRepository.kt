package com.example.videotask.repository

import com.example.videotask.network.response.VideoResponse

interface VideoRepository {
    suspend fun  video(): VideoResponse
}