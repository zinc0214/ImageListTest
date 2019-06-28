package ayhan.com.imagelisttest.view.imagelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import ayhan.com.imagelisttest.R
import ayhan.com.imagelisttest.databinding.FragmentImageListBinding
import ayhan.com.imagelisttest.model.Image
import ayhan.com.imagelisttest.viewmodel.ImageListViewModel
import kotlinx.android.synthetic.main.fragment_image_list.*

/**
 * Created by HanAYeon on 2019-06-28.
 */

class ImageListFragment : Fragment() {

    private lateinit var dataBinding: FragmentImageListBinding
    private val viewModel =  ImageListViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = DataBindingUtil.inflate<FragmentImageListBinding>(
            inflater,
            R.layout.fragment_image_list,
            container,
            false
        ).apply {
            vm = viewModel
            lifecycleOwner = this@ImageListFragment
        }
        return dataBinding.root
    }

    private fun searchBtnOnClickListener() = View.OnClickListener {
        viewModel.getImageListBySearchWord(editText.text.toString(), object : ImageListViewModel.getDataCallback {
            override fun onSucced(result: List<Image>) {

            }

            override fun onFailed() {

            }

        })
    }


}

