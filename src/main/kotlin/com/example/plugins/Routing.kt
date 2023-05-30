package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*
import routes.getMovie

fun Application.configureRouting() {
    routing {
        getMovie()
        // Static plugin. Try to access `/static/index.html`
        staticResources("/", "static")
    }
}
