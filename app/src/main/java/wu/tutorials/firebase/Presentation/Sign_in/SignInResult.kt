package wu.tutorials.firebase.Presentation.Sign_in

data class SignInResult(
    val data: wu.tutorials.firebase.Presentation.Sign_in.UserData?,
    val errorMessage: String ?
)

data class UserData (
    val userId:String,
    val username:String?,
    val profilePictureUrl:String?
)
