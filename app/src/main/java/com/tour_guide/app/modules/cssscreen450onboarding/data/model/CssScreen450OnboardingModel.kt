package com.tour_guide.app.modules.cssscreen450onboarding.`data`.model

import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.di.MyApp
import kotlin.String

data class CssScreen450OnboardingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDiscoverbestp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_discover_best_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
