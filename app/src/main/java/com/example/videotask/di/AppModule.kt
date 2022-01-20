package com.example.videotask.di

import android.content.Context
import com.example.videotask.presentation.VideoTaskApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author shital awathe
 * This class provides the application level dependency
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): VideoTaskApplication {
        return app as VideoTaskApplication
    }
}