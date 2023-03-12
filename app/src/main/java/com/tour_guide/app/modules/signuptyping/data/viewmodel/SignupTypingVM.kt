package com.tour_guide.app.modules.signuptyping.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tour_guide.app.modules.signuptyping.`data`.model.SignupTypingModel
import org.koin.core.KoinComponent

class SignupTypingVM : ViewModel(), KoinComponent {
  val signupTypingModel: MutableLiveData<SignupTypingModel> = MutableLiveData(SignupTypingModel())

  var navArguments: Bundle? = null
}
