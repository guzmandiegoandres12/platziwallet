package com.cristianvillamil.platziwallet.ui.transfer

class TransferFasade {
    val analiticsManager: AnaliticsManager = AnaliticsManager()
    val segurityManager:SegurityManager = SegurityManager()
    val transferManager: TransferManager = TransferManager()
    fun transfer(){
        val token = segurityManager.getToken()
        analiticsManager.registertTransfer(token)
        transferManager.transfer(token)


    }
}