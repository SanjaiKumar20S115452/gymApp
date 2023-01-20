package com.example.routes

import com.example.repository.StrengtheningRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getSelectedStrengthClassRoute() {
    val strengthRepository: StrengtheningRepository by inject()
    get("/strengthClasses") {
        try {
            val classId = call.request.queryParameters["classId"]?.toInt() ?: 1
            val apiResponse = strengthRepository.getSelectedStrengthClasses(classId)
            if(apiResponse.strengthClasses!!.isNotEmpty()) {
                call.respond(
                    status = HttpStatusCode.OK,
                    message = apiResponse
                )
            }else {
                call.respond(
                    status = HttpStatusCode.BadRequest,
                    message = "Unknown error"
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