package com.cristianvillamil.platziwallet.ui.obserbable

class AvailableBalanceObservable: Obserbable {
    private val amountObserverlist:ArrayList<Observer> = arrayListOf()
    private var amount:Double=0.0
    fun  Amount(newValue: Double){
        amount=newValue
        notifyObservers(amount)
    }
    override fun addObservet(observer: Observer) {
        amountObserverlist.add(observer)
    }
    override fun RemoveObserver(observer: Observer) {
       amountObserverlist.remove(observer)
    }

    override fun notifyObservers(newValue: Double) {
       amountObserverlist.forEach {
           it.notifyChance(newValue)
       }
    }
}