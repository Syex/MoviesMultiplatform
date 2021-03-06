package net.grandcentrix.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Movie(
        val adult: Boolean?,
        val backdrop_path: String?,
        val belongs_to_collection: Any?,
        val budget: Int?,
        val genres: List<Genres>?,
        val homepage: String?,
        val id: Int?,
        val imdb_id: String?,
        val original_language: String?,
        val original_title: String?,
        val overview: String?,
        val popularity: Float?,
        val poster_path: String?,
        val production_companies: List<ProductionCompanies>?,
        val production_countries: List<ProductionCountries>?,
        val release_date: String?,
        val revenue: Int?,
        val runtime: Int?,
        val spoken_languages: List<SpokenLanguages>?,
        val status: String?,
        val tagline: String?,
        val title: String?,
        val video: Boolean?,
        val vote_average: Float?,
        val vote_count: Int?
)

@Serializable
data class Genres(
        val id: Int?,
        val name: String?
)

@Serializable
data class ProductionCompanies(
        val id: Int?,
        val logo_path: String?,
        val name: String?,
        val origin_country: String?
)

@Serializable
data class ProductionCountries(
        val iso_3166_1: String?,
        val name: String?
)

@Serializable
data class SpokenLanguages(
        val iso_639_1: String?,
        val name: String?
)
