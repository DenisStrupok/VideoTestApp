package com.example.data.repositories

import com.example.data.services.VideoService
import com.example.domain.repositories.VideoRepository

class VideoRepositoryImpl(
    private val videoService: VideoService
): VideoRepository {

    override suspend fun getRandomList() {
        TODO("Not yet implemented")
    }
}