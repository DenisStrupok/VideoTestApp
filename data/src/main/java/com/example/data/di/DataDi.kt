package com.example.data.di

import com.example.data.repositories.VideoRepositoryImpl
import com.example.data.services.VideoService
import com.example.domain.repositories.VideoRepository
import org.koin.dsl.module
import retrofit2.Retrofit

private val repositoriesModule = module {
    factory<VideoRepository> { VideoRepositoryImpl(get()) }
}

private val serviceModule = module {
    single<VideoService> {
        (get() as Retrofit).create(VideoService::class.java)
    }
}



val dataModule = arrayOf(repositoriesModule, serviceModule )