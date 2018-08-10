package de.gcx

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.http.URLProtocol
import kotlinx.coroutines.experimental.CoroutineDispatcher
import kotlinx.coroutines.experimental.launch

class Api {

    private val client = HttpClient()

    fun about(callback: (String) -> Unit) {
        launch {
            val result: String = client.get {
                url {
                    protocol = URLProtocol.HTTP
                    host = "www.google.de"
                }
            }

            callback(result)
        }
    }
}