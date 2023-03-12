package com.tour_guide.app.modules.cssscreen450homeone.ui

import android.view.View
import androidx.activity.viewModels
import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.base.BaseActivity
import com.tour_guide.app.databinding.ActivityCssScreen450HomeOneBinding
import com.tour_guide.app.modules.cssscreen450homeone.`data`.model.Listrectanglethree1RowModel
import com.tour_guide.app.modules.cssscreen450homeone.`data`.viewmodel.CssScreen450HomeOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CssScreen450HomeOneActivity :
    BaseActivity<ActivityCssScreen450HomeOneBinding>(R.layout.activity_css_screen_450_home_one) {
  private val viewModel: CssScreen450HomeOneVM by viewModels<CssScreen450HomeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglethreeAdapter =
    ListrectanglethreeAdapter(viewModel.listrectanglethreeList.value?:mutableListOf())
    binding.recyclerListrectanglethree.adapter = listrectanglethreeAdapter
    listrectanglethreeAdapter.setOnItemClickListener(
    object : ListrectanglethreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectanglethree1RowModel) {
        onClickRecyclerListrectanglethree(view, position, item)
      }
    }
    )
    viewModel.listrectanglethreeList.observe(this) {
      listrectanglethreeAdapter.updateData(it)
    }
    binding.cssScreen450HomeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectanglethree(
    view: View,
    position: Int,
    item: Listrectanglethree1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CSS_SCREEN450HOME_ONE_ACTIVITY"

  }
}
