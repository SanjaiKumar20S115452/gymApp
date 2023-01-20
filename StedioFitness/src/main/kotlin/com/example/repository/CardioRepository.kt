package com.example.repository

import com.example.model.ApiResponse
import com.example.model.Cardio

interface CardioRepository {

    val cardio: List<Cardio>
    suspend fun getAllCardio(): ApiResponse

}