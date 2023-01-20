package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Cardio(
    val id: Int,
    val exerciseName: String,
    val time: String,
    val image: String,
    val benefits: String
)