package com.tour_guide.app.modules.cssscreen450homeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tour_guide.app.modules.cssscreen450homeone.`data`.model.CssScreen450HomeOneModel
import com.tour_guide.app.modules.cssscreen450homeone.`data`.model.Listrectanglethree1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CssScreen450HomeOneVM : ViewModel(), KoinComponent {
  val cssScreen450HomeOneModel: MutableLiveData<CssScreen450HomeOneModel> =
      MutableLiveData(CssScreen450HomeOneModel())

  var navArguments: Bundle? = null

  val listrectanglethreeList: MutableLiveData<MutableList<Listrectanglethree1RowModel>> =
      MutableLiveData(mutableListOf())
}
