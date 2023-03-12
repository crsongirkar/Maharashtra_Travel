package com.tour_guide.app.appcomponents.googleauth

import android.R
import android.app.Activity
import android.content.Intent
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task

import com.tour_guide.app.modules.home.ui.HomeActivity


class GoogleHelper(
    private val activity: ComponentActivity,
    private val onSuccess: (account: GoogleSignInAccount) -> Unit,
    private val onError: (statusCode: Int) -> Unit
) {

    private var mGoogleSignInClient: GoogleSignInClient? = null

    private val startForGoogleResult =
        activity.registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                // Handle Result
                handleResult(result.data)
            }
        }

    /** This method will be used for login
     *  How to use: on the button click call this method
     *  [Class_Object].login()
     * */
    fun login() {
        configureGoogleSignIn()
        val account = GoogleSignIn.getLastSignedInAccount(activity)
        if (account != null) {
            onSuccess(account)
        } else {
            signIn()
        }
    }

    /** configure Google Sign-In to request the user data required by application
     *  ID and basic profile are included in DEFAULT_SIGN_IN.
     *  To request users' email addresses as well, create the GoogleSignInOptions object with the requestEmail option.
     *  How to use:
     *  [Class_Object].configureGoogleSignIn()
     * */



    private fun configureGoogleSignIn() {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()



//        val intent = Intent(this, HomeActivity::class.java)
//        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
//        startActivity(intent)


        mGoogleSignInClient = GoogleSignIn.getClient(activity, gso)
    }


    /** This function will be used handle the result
     *  @param data it is the intent passed as a parameter
     *  How to use:
     *  used from the onActivityResult
     *  if(requestCode == RC_SIGN_IN) {
     *        [Class_Object].handleResult(data)
     *  }
     * */
    companion object {
        private const val GOOGLE_PRIVATE_CLIENT_ID =
            "729745088940-mved8tkjbstj72kbuutbmc6uckddfn93.apps.googleusercontent.com"   // change it with your google private client id
        const val RC_GOOGLE_SIGN_IN_CODE = 2555
    }

    private fun handleResult(data: Intent?) {
        val task = GoogleSignIn.getSignedInAccountFromIntent(data)
        try {
            val account: GoogleSignInAccount? = task.getResult(ApiException::class.java)


            if (account != null) {
                println("Login Successful")
                onSuccess(account)



            }
        } catch (e: ApiException) {
            println("Error")
            onError(e.statusCode)
        }
    }

    private fun Intent(googleHelper: GoogleHelper, java: Class<HomeActivity>) {

    }

    private fun startActivity(intent: Unit) {

    }


    /** Call the signIn intent
     *  this function will call startActivityForResult from their result will be handled
     * */
    private fun signIn() {
        val signInIntent: Intent = mGoogleSignInClient!!.signInIntent
        startForGoogleResult.launch(signInIntent)
    }


    /** Sign out the user
     *  How to use:
     *  [Class_Object].signOut { task ->  }
     * */
    fun signOut(onComplete: (task: Task<Void>) -> Unit) {
        mGoogleSignInClient?.signOut()?.addOnCompleteListener(
            activity
        ) { task -> onComplete(task) }
    }

    /** revoke the access, disconnect user's Google account from the app
     *  How to use:
     *  [Class_Object].revokeAccess{task -> }
     * */
    fun revokeAccess(onComplete: (task: Task<Void>) -> Unit) {
        mGoogleSignInClient!!.revokeAccess()
            .addOnCompleteListener(
                activity
            ) { task -> onComplete(task) }
    }
}