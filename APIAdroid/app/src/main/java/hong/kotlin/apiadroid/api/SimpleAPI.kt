package hong.kotlin.apiadroid.ui

import hong.kotlin.apiadroid.model.Post
import retrofit2.http.GET

interface SimpleAPI {
    @GET("posts/1")
    suspend fun getpost():Post

}