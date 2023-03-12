package com.tour_guide.app.modules.logintyping.ui

import androidx.activity.viewModels
import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.base.BaseActivity
import com.tour_guide.app.appcomponents.googleauth.GoogleHelper
import com.tour_guide.app.databinding.ActivityLoginTypingBinding
import com.tour_guide.app.modules.logintyping.`data`.viewmodel.LoginTypingVM
import kotlin.String
import kotlin.Unit

class LoginTypingActivity : BaseActivity<ActivityLoginTypingBinding>(R.layout.activity_login_typing)
    {
  private val viewModel: LoginTypingVM by viewModels<LoginTypingVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginTypingVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowgoogle.setOnClickListener {
        googleLogin.login()
      }
    }

    companion object {
      const val TAG: String = "LOGIN_TYPING_ACTIVITY"

    }
  }
