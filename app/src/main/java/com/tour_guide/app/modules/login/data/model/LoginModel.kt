package com.tour_guide.app.modules.login.`data`.model

import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeBack: String? = MyApp.getInstance().resources.getString(R.string.msg_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHappytoseeyo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_happy_to_see_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginwithGoog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_goog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameFiveValue: String? = null
)
