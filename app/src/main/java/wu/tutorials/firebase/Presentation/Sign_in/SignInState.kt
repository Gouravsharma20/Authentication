package wu.tutorials.firebase.Presentation.Sign_in

data class SignInState(
    val isSignInSuccessful : Boolean = false,
    val signInError : String? = null
)
