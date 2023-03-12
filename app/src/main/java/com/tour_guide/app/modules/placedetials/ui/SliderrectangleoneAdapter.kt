package com.tour_guide.app.modules.placedetials.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.tour_guide.app.databinding.SlideritemPlaceDetials1Binding
import com.tour_guide.app.modules.placedetials.`data`.model.ImageSliderSliderrectangleoneModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderrectangleoneAdapter(
  val dataList: ArrayList<ImageSliderSliderrectangleoneModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderrectangleoneModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemPlaceDetials1Binding) {
      binding.imageSliderSliderrectangleoneModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemPlaceDetials1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
