package com.cristianvillamil.platziwallet.ui.home.data

import com.cristianvillamil.platziwallet.ui.home.view.UserViewModel

class UserAdapter(){
    fun getUserViewModel(userResponse: UserResponse): UserViewModel {
        val userViewModel= UserViewModel(userResponse.Username,userResponse.userPhotoUrl)
        return userViewModel
    }
}