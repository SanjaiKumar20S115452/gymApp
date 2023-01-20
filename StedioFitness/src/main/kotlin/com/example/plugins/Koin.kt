package com.example.plugins

import com.example.di.cardioModule
import com.example.di.strengthModule
import io.ktor.server.application.*
import org.koin.core.logger.Level
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun Application.configureKoin() {
    install(Koin) {
        modules(cardioModule, strengthModule)
        slf4jLogger(level = Level.ERROR)
    }
}