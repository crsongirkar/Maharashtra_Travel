package com.tour_guide.app.modules.signuptyping.ui

import androidx.activity.viewModels
import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.base.BaseActivity
import com.tour_guide.app.databinding.ActivitySignupTypingBinding
import com.tour_guide.app.modules.signuptyping.`data`.viewmodel.SignupTypingVM
import kotlin.String
import kotlin.Unit

class SignupTypingActivity :
    BaseActivity<ActivitySignupTypingBinding>(R.layout.activity_signup_typing) {
  private val viewModel: SignupTypingVM by viewModels<SignupTypingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupTypingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGNUP_TYPING_ACTIVITY"

  }
}
