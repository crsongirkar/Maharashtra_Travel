package com.tour_guide.app.modules.onboarding.`data`.model

import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingModel(
  /**
   * TODO Replace with dynamic value
   */


  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
