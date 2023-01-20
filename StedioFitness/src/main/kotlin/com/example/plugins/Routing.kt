package com.example.plugins

import com.example.routes.cardioRoute
import com.example.routes.getSelectedStrengthClassRoute
import com.example.routes.strengthRoute
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        static("/image") {
            resources("image")
        }
        cardioRoute()
        strengthRoute()
        getSelectedStrengthClassRoute()
    }

}
