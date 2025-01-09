package com.pcmdam.paucasascafeteria

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pcmdam.paucasascafeteria.User

class SharedViewModel: ViewModel() {
    val _user = MutableLiveData<User>()
//    val user: LiveData<User> = _user


    fun login(name: String, pwd: String) {
        _user.value = User(name, pwd)
    }

}