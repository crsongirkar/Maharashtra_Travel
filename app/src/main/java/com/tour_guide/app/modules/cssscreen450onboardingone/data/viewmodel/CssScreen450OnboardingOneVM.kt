package com.tour_guide.app.modules.cssscreen450onboardingone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tour_guide.app.modules.cssscreen450onboardingone.`data`.model.CssScreen450OnboardingOneModel
import org.koin.core.KoinComponent

class CssScreen450OnboardingOneVM : ViewModel(), KoinComponent {
  val cssScreen450OnboardingOneModel: MutableLiveData<CssScreen450OnboardingOneModel> =
      MutableLiveData(CssScreen450OnboardingOneModel())

  var navArguments: Bundle? = null
}
