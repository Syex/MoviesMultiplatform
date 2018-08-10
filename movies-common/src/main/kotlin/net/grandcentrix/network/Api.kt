package net.grandcentrix.network

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.http.URLProtocol
import kotlinx.coroutines.experimental.launch
import kotlinx.serialization.json.JSON
import net.grandcentrix.network.model.Movie

private const val BASE_API = "api.themoviedb.org/3"

class Api {

    private val client = HttpClient()

    fun singleMovie(movieId: String, callback: (Movie) -> Unit) {
        launch {
            val result: String = client.get {
                url {
                    protocol = URLProtocol.HTTPS
                    port = URLProtocol.HTTPS.defaultPort
                    host = BASE_API
                    path("movie", movieId)
                    parameter("api_key", APIKEY)
                }
            }

            callback(JSON.parse(result))
        }
    }
}