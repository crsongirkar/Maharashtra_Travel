package com.tour_guide.app.modules.cssscreen450home.ui

import android.view.View
import androidx.activity.viewModels
import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.base.BaseActivity
import com.tour_guide.app.databinding.ActivityCssScreen450HomeBinding
import com.tour_guide.app.modules.cssscreen450home.`data`.model.ListrectanglethreeRowModel
import com.tour_guide.app.modules.cssscreen450home.`data`.viewmodel.CssScreen450HomeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CssScreen450HomeActivity :
    BaseActivity<ActivityCssScreen450HomeBinding>(R.layout.activity_css_screen_450_home) {
  private val viewModel: CssScreen450HomeVM by viewModels<CssScreen450HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglethreeAdapter =
    ListrectanglethreeAdapter(viewModel.listrectanglethreeList.value?:mutableListOf())
    binding.recyclerListrectanglethree.adapter = listrectanglethreeAdapter
    listrectanglethreeAdapter.setOnItemClickListener(
    object : ListrectanglethreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectanglethreeRowModel) {
        onClickRecyclerListrectanglethree(view, position, item)
      }
    }
    )
    viewModel.listrectanglethreeList.observe(this) {
      listrectanglethreeAdapter.updateData(it)
    }
    binding.cssScreen450HomeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectanglethree(
    view: View,
    position: Int,
    item: ListrectanglethreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CSS_SCREEN450HOME_ACTIVITY"

  }
}
