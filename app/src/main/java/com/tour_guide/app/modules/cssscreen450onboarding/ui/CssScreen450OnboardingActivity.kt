package com.tour_guide.app.modules.cssscreen450onboarding.ui

import androidx.activity.viewModels
import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.base.BaseActivity
import com.tour_guide.app.databinding.ActivityCssScreen450OnboardingBinding
import com.tour_guide.app.modules.cssscreen450onboarding.`data`.viewmodel.CssScreen450OnboardingVM
import kotlin.String
import kotlin.Unit

class CssScreen450OnboardingActivity :
    BaseActivity<ActivityCssScreen450OnboardingBinding>(R.layout.activity_css_screen_450_onboarding)
    {
  private val viewModel: CssScreen450OnboardingVM by viewModels<CssScreen450OnboardingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cssScreen450OnboardingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CSS_SCREEN450ONBOARDING_ACTIVITY"

  }
}
