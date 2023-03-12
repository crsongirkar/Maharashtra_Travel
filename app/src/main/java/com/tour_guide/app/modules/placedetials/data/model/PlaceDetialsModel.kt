package com.tour_guide.app.modules.placedetials.`data`.model

import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.di.MyApp
import kotlin.String

data class PlaceDetialsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_sant_paulo_mil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMilanoMountain: String? =
      MyApp.getInstance().resources.getString(R.string.msg_milano_mountain)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_do)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_30_min_by_car)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServicesinMil: String? =
      MyApp.getInstance().resources.getString(R.string.msg_services_in_mil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMilanoCafe: String? = MyApp.getInstance().resources.getString(R.string.lbl_milano_cafe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryOne: String? = MyApp.getInstance().resources.getString(R.string.msg_sant_paulo_mil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_4_0_36_review2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMilanoCafeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_milano_cafe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPark: String? = MyApp.getInstance().resources.getString(R.string.lbl_park)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_sant_paulo_mil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_4_0_36_review2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameSeventeenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameSeventeenOneValue: String? = null
)
