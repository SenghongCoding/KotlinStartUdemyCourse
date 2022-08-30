package hong.kotlin.apiadroid.api

import hong.kotlin.apiadroid.model.util.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofinInstance {
  private val retrofit by lazy {
   Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()
  }

 val api : SimpleAPI by lazy {
  retrofit.create(SimpleAPI::class.java)

 }
}