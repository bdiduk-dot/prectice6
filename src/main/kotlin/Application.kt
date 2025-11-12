package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.http.content.*

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    routing {
        // Главная страница
        get("/") {
            call.respondText("Hello world!")
        }

        // Подключение HTML
        static("/content") {
            resources("content")
        }
    }
}
