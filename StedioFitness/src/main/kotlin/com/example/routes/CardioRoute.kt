package com.example.routes

import com.example.repository.CardioRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.cardioRoute() {
    val cardioRepository: CardioRepository by inject()
    get("/cardio") {
        val apiResponse = cardioRepository.getAllCardio()
        try {
            if(apiResponse.cardio!!.isNotEmpty()) {
                call.respond(
                    status = HttpStatusCode.OK,
                    message = apiResponse
                )
            }else {
                call.respond(
                    status = HttpStatusCode.Conflict,
                    message = "Error Occurred"
                )
            }
        }catch (e: Exception) {
            call.respond(
                status = HttpStatusCode.BadRequest,
                message = e.message ?: "Error Occurred"
            )
        }
    }
}