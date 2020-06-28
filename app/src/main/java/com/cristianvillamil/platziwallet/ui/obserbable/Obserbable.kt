package com.cristianvillamil.platziwallet.ui.obserbable

interface Obserbable {
    fun addObservet(observer: Observer)
    fun RemoveObserver(observer: Observer)
    fun notifyObservers(newValue:Double)
}