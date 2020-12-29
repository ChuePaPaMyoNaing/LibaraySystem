package jp.co.cybermissions.com.example.libaraysystem.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import jp.co.cybermissions.com.example.libaraysystem.FirebaseUserLiveData

class LoginViewModel : ViewModel() {
    enum class AuthenticationState {
        AUTHENTICATED, UNAUTHENTICATED
    }

    val authenticationState = FirebaseUserLiveData().map { user ->
        if (user != null) {
            AuthenticationState.AUTHENTICATED
        } else {
            AuthenticationState.UNAUTHENTICATED
        }
    }
}
