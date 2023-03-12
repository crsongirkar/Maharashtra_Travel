package com.tour_guide.app.modules.cssscreen450onboarding.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tour_guide.app.modules.cssscreen450onboarding.`data`.model.CssScreen450OnboardingModel
import org.koin.core.KoinComponent

class CssScreen450OnboardingVM : ViewModel(), KoinComponent {
  val cssScreen450OnboardingModel: MutableLiveData<CssScreen450OnboardingModel> =
      MutableLiveData(CssScreen450OnboardingModel())

  var navArguments: Bundle? = null
}
