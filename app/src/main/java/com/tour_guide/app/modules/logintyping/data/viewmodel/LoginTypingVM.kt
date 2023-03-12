package com.tour_guide.app.modules.logintyping.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tour_guide.app.modules.logintyping.`data`.model.LoginTypingModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class LoginTypingVM : ViewModel(), KoinComponent {
  val loginTypingModel: MutableLiveData<LoginTypingModel> = MutableLiveData(LoginTypingModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
