package com.example.videotask.di

import com.example.videotask.network.services.VideoService
import com.example.videotask.repository.VideoRepository
import com.example.videotask.repository.VideoRepositoryImpl
import dagger.Provides
import javax.inject.Singleton

/**
 * @author shital awathe
 *
 * This class has dependency of repository
 */
object RepositoryModule {

    /**
     * Search address repository
     */
    @Singleton
    @Provides
    fun provideVideoRepository(
        addressService: VideoService,
    ): VideoRepository {
        return VideoRepositoryImpl(addressService)
    }
}