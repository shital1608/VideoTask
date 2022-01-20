package com.example.videotask.di

import com.example.videotask.network.services.VideoService
import com.example.videotask.network.util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    /**
     * Provide http client dependency
     */
    @Singleton
    @Provides
    fun provideHttpClient(): OkHttpClient {
        return OkHttpClient
            .Builder()
            .readTimeout(100, TimeUnit.SECONDS)
            .connectTimeout(100, TimeUnit.SECONDS)
            .build()
    }

    /**
     * Provide retrofit dependency for base url
     * @param okHttpClient
     * @param gsonConverterFactory
     */
    @Singleton
    @Provides
    fun provideBaseRetrofit(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    /**
     * Provide video service
     */
    @Singleton
    @Provides
    fun provideLoginService(retrofit: Retrofit): VideoService{
        return retrofit.create(VideoService::class.java)
    }

}