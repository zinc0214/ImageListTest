package ayhan.com.imagelisttest.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import ayhan.com.imagelisttest.model.Image
import ayhan.com.imagelisttest.network.RetrofitInterface
import ayhan.com.imagelisttest.util.ImageListLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by HanAYeon on 2019-06-28.
 */

class ImageListViewModel : ViewModel() {

    interface getDataCallback {
        fun onSucced(result: List<Image>)
        fun onFailed()
    }

    companion object {
        private const val API = "https://www.shutterstock.com/ko/search/"
    }

    val imageListLiveData = ImageListLiveData()


    fun getImageListBySearchWord(searchWord: String, callback: getDataCallback) {

       /* val restClient: RetrofitInterface = OkHttp3RetrofitManager(API).getRetrofitService(RetrofitInterface::class.java)

        val bucketListResultData = restClient.requestImageListByWord(searchWord)
        bucketListResultData.enqueue(object : Callback<List<Image>> {
            override fun onFailure(call: Call<List<Image>>, t: Throwable) {
                callback.onFailed()
            }

            override fun onResponse(call: Call<List<Image>>, response: Response<List<Image>>) {
               Log.e("ayhan", "${response.body()}")

            }

        })*/

    }

}