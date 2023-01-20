package com.example.repository

import com.example.model.ApiResponse
import com.example.model.StrengthClasses
import com.example.model.Strengthening

interface StrengtheningRepository {
    val allStrengthening: List<Strengthening>
    val getSelectedStrengthClass: Map<Int, List<StrengthClasses>>
    suspend fun getAllStrengthening(): ApiResponse
    suspend fun getSelectedStrengthClasses(classId: Int): ApiResponse
}