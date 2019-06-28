package ayhan.com.imagelisttest.network

import ayhan.com.imagelisttest.model.Image
import okhttp3.RequestBody
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.*
import java.io.File

/**
 * Created by HanAYeon on 2018. 12. 3..
 */

interface RetrofitInterface {

    @GET("/{word}")
    fun requestImageListByWord(@Path("word") searchWord : String): Call<List<Image>>

}