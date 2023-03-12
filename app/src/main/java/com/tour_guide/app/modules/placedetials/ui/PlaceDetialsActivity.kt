package com.tour_guide.app.modules.placedetials.ui

import android.net.Uri
import androidx.activity.viewModels
import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.base.BaseActivity
import com.tour_guide.app.databinding.ActivityPlaceDetialsBinding
import com.tour_guide.app.modules.placedetials.`data`.model.ImageSliderSliderrectangleoneModel
import com.tour_guide.app.modules.placedetials.`data`.viewmodel.PlaceDetialsVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class PlaceDetialsActivity :
    BaseActivity<ActivityPlaceDetialsBinding>(R.layout.activity_place_detials) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.chinmaysapplication.app/drawable/img_rectangle1_363x376")


  private val imageSliderSliderrectangleoneItems: ArrayList<ImageSliderSliderrectangleoneModel> =
      arrayListOf(ImageSliderSliderrectangleoneModel(imageRectangleOne =
  imageUri.toString()),ImageSliderSliderrectangleoneModel(imageRectangleOne =
  imageUri.toString()))


  private val viewModel: PlaceDetialsVM by viewModels<PlaceDetialsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderrectangleoneAdapter =
    SliderrectangleoneAdapter(imageSliderSliderrectangleoneItems,true)
    binding.imageSliderSliderrectangleone.adapter = sliderrectangleoneAdapter
    binding.imageSliderSliderrectangleone.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorFrameThirtySix.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorFrameThirtySix.updateIndicatorCounts(binding.imageSliderSliderrectangleone.indicatorCount)
    binding.placeDetialsVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderrectangleone.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderrectangleone.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PLACE_DETIALS_ACTIVITY"

  }
}
