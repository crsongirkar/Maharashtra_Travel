package com.tour_guide.app.modules.signuptyping.`data`.model

import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.di.MyApp
import kotlin.String

data class SignupTypingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomePlease: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_please)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlexandrogmail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_alexandro_gmail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameSixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameEightValue: String? = null
)
