package com.cristianvillamil.platziwallet

import kotlin.contracts.Returns

class UserSingleton {
    val userName="diego"
    companion object{
        private var instance : UserSingleton? = null
        fun getInstance (): UserSingleton {
            if(instance == null){
                instance = UserSingleton()
            }
            return instance as UserSingleton
        }
    }
}