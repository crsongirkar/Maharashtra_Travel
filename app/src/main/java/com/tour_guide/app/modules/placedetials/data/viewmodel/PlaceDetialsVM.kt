package com.tour_guide.app.modules.placedetials.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tour_guide.app.modules.placedetials.`data`.model.PlaceDetialsModel
import org.koin.core.KoinComponent

class PlaceDetialsVM : ViewModel(), KoinComponent {
  val placeDetialsModel: MutableLiveData<PlaceDetialsModel> = MutableLiveData(PlaceDetialsModel())

  var navArguments: Bundle? = null
}
