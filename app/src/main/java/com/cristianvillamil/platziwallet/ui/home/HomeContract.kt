package com.cristianvillamil.platziwallet.ui.home

import androidx.lifecycle.LiveData

interface HomeContract {
    interface View{
        fun showLoader()
        fun hideLoader()
        fun showFaboriteTransfers(favoriteTransfer: List<FavoriteTransfer>)
    }
    interface Presenter {
        fun  retrieveFavoriteTransfers()
        fun getPresentageKiveData() : LiveData<String>
    }
    interface OnResponseCallback{
        fun onResponse(faboriteList: List<FavoriteTransfer>)
    }
}