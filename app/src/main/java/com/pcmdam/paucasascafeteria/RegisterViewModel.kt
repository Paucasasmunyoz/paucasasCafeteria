package com.pcmdam.paucasascafeteria

import androidx.lifecycle.ViewModel

class RegisterViewModel: ViewModel() {

    private var _user=""
    val user: String
        get() = _user


    private var _password=""
    val password: String
        get() = _password

}