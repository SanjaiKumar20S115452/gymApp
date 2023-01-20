package com.example.routes

import com.example.repository.StrengtheningRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.strengthRoute() {
    val strengthRepository: StrengtheningRepository by inject()
    get("/strength") {
        val apiResponse = strengthRepository.getAllStrengthening()
        try {
            if(apiResponse.strengthening!!.isNotEmpty()) {
                call.respond(
                    status = HttpStatusCode.OK,
                    message = apiResponse
                )
            }
        }catch (e: Exception) {
            call.respond(
                status = HttpStatusCode.BadRequest,
                message = "Unknown error"
            )
        }
    }
}