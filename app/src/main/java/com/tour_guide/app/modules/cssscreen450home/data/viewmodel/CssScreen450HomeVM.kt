package com.tour_guide.app.modules.cssscreen450home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tour_guide.app.modules.cssscreen450home.`data`.model.CssScreen450HomeModel
import com.tour_guide.app.modules.cssscreen450home.`data`.model.ListrectanglethreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CssScreen450HomeVM : ViewModel(), KoinComponent {
  val cssScreen450HomeModel: MutableLiveData<CssScreen450HomeModel> =
      MutableLiveData(CssScreen450HomeModel())

  var navArguments: Bundle? = null

  val listrectanglethreeList: MutableLiveData<MutableList<ListrectanglethreeRowModel>> =
      MutableLiveData(mutableListOf())
}
