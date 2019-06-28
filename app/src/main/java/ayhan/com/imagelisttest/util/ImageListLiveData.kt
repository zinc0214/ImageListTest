package ayhan.com.imagelisttest.util

import androidx.lifecycle.LiveData
import ayhan.com.imagelisttest.model.Image

/**
 * Created by HanAYeon on 2019-06-28.
 */

class ImageListLiveData : LiveData<List<Image>>() {
    private val list = mutableListOf<Image>()

    init {
        value = list
    }

    fun clear() {
        list.clear()
        this.value = list
    }

    fun size() : Int {
        return list.size
    }

    fun get(index : Int) : Image {
        return list[index]
    }
}