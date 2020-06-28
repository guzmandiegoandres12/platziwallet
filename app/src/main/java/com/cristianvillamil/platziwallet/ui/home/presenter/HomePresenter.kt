package com.cristianvillamil.platziwallet.ui.home.presenter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import com.cristianvillamil.platziwallet.ui.home.data.User
import com.cristianvillamil.platziwallet.ui.home.data.User.Builder

class HomePresenter(private  val view: HomeContract.View) : HomeContract.Presenter {
    private val homeInteractor = HomeInteractor()
    private val porcentageLineData: MutableLiveData<String> = MutableLiveData()
    override fun retrieveFavoriteTransfers(){
         view.showLoader()
        homeInteractor.retrieveTranferFaboryToCahe(object :HomeContract.OnResponseCallback{
            override fun onResponse(faboriteList: List<FavoriteTransfer>) {
                val usuario = User.Builder()
                    .setUserName("asdasjdha")
                    .setPassword("asdasdasgfdf")
                porcentageLineData.value = "40%"
                view.hideLoader()
                view.showFaboriteTransfers(faboriteList)
            }

        })
    }

    override fun getPresentageKiveData() : LiveData<String> = porcentageLineData
}


