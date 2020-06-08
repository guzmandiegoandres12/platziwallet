package com.cristianvillamil.platziwallet.ui.home

interface HomeContract {
    interface View{
        fun showLoader()
        fun hideLoader()
        fun showFaboriteTransfers(favoriteTransfer: List<FavoriteTransfer>)
    }
    interface Presenter {
       fun  retrieveFavoriteTransfers()
    }
    interface OnResponseCallback{
        fun onResponse(faboriteList: List<FavoriteTransfer>)
    }
}