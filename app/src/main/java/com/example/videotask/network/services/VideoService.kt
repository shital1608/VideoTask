package com.example.videotask.network.services

import com.example.videotask.network.response.VideoResponse
import com.example.videotask.network.util.Constants
import retrofit2.http.POST

interface VideoService {
    @POST(Constants.VIDEO_URL)
    suspend fun videos(): VideoResponse
}