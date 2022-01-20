package com.example.videotask.repository

import com.example.videotask.network.response.VideoResponse
import com.example.videotask.network.services.VideoService

/**
 * @author shital awathe
 * Video repository implementation
 *
 * @param videoService
 * @see  VideoService
 * @see VideoRepository
 */
class VideoRepositoryImpl(
    private val videoService: VideoService,
) : VideoRepository {
    override suspend fun video(): VideoResponse {
        return videoService.videos()
    }
}