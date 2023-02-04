package com.example.domain.repositories

interface VideoRepository {

    suspend fun getRandomList()
}