package routes

import data.model.getMovies
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getMovie() {
    get("/movies") {
        call.respond(
            HttpStatusCode.OK,
            getMovies()
        )
    }
}