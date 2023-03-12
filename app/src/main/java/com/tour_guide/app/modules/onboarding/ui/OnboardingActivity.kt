package com.tour_guide.app.modules.onboarding.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.base.BaseActivity
import com.tour_guide.app.databinding.ActivityOnboardingBinding
import com.tour_guide.app.modules.login.ui.LoginActivity
import com.tour_guide.app.modules.onboarding.`data`.viewmodel.OnboardingVM
import kotlin.String
import kotlin.Unit

class OnboardingActivity : BaseActivity<ActivityOnboardingBinding>(R.layout.activity_onboarding) {
  private val viewModel: OnboardingVM by viewModels<OnboardingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 100)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "ONBOARDING_ACTIVITY"

    }
  }
