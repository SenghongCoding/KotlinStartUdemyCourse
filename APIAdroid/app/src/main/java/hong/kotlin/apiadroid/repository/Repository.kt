package hong.kotlin.apiadroid.repository

import hong.kotlin.apiadroid.api.RetrofinInstance
import hong.kotlin.apiadroid.model.Post

class Repository {
    suspend fun getPost():Post{
        return RetrofinInstance.api.getpost()
    }
}