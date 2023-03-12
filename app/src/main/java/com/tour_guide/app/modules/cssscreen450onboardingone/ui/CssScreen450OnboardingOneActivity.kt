package com.tour_guide.app.modules.cssscreen450onboardingone.ui

import androidx.activity.viewModels
import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.base.BaseActivity
import com.tour_guide.app.databinding.ActivityCssScreen450OnboardingOneBinding
import com.tour_guide.app.modules.cssscreen450onboardingone.`data`.viewmodel.CssScreen450OnboardingOneVM
import kotlin.String
import kotlin.Unit

class CssScreen450OnboardingOneActivity :
    BaseActivity<ActivityCssScreen450OnboardingOneBinding>(R.layout.activity_css_screen_450_onboarding_one)
    {
  private val viewModel: CssScreen450OnboardingOneVM by viewModels<CssScreen450OnboardingOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cssScreen450OnboardingOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CSS_SCREEN450ONBOARDING_ONE_ACTIVITY"

  }
}
