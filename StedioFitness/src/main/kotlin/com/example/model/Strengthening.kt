package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Strengthening(
    val id: Int,
    val exerciseName: String,
    val image: String,
    val classes: List<StrengthClasses>
)