package hong.kotlin.apiadroid.model

import com.google.gson.annotations.SerializedName

class Post(
//    @SerializedName()
    var userId : Int,
    var id : Int,
    var title : String,
    var body : String
)
