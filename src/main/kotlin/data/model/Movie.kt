package data.model

import kotlinx.serialization.Serializable

@Serializable
data class Movie(
    val movieId: Int,
    val movieName: String,
    val movieOverview: String,
    val movieGenre: String,
    val movieImageUrl: String
)
