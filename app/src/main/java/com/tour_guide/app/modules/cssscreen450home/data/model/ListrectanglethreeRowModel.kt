package com.tour_guide.app.modules.cssscreen450home.`data`.model

import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectanglethreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMilanoPark: String? = MyApp.getInstance().resources.getString(R.string.lbl_milano_park)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryOne: String? = MyApp.getInstance().resources.getString(R.string.msg_sant_paulo_mil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_4_0_36_review)

)
