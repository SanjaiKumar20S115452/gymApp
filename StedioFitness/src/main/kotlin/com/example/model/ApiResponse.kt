package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val success: Boolean,
    val message: String? = null,
    val cardio: List<Cardio>? = null,
    val strengthening: List<Strengthening>? = null,
    val strengthClasses: List<StrengthClasses>? = null
)