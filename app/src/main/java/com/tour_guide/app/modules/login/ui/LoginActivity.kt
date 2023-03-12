package com.tour_guide.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.firebase.auth.FirebaseAuth
import com.tour_guide.app.R
import com.tour_guide.app.appcomponents.base.BaseActivity
import com.tour_guide.app.appcomponents.googleauth.GoogleHelper
import com.tour_guide.app.databinding.ActivityLoginBinding
import com.tour_guide.app.modules.login.data.viewmodel.LoginVM
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private lateinit var googleLogin: GoogleHelper
  private lateinit var auth : FirebaseAuth
  private lateinit var googleSignInClient: GoogleSignInClient

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
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
      const val TAG: String = "LOGIN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoginActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
