package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class StrengthClasses(
    val id: Int,
    val className: String,
    val rep: String
)
