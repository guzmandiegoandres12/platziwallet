package com.cristianvillamil.platziwallet.ui.transfer

class TransferProxi {

    val MAX_TRANSFER_AMOUNT = 1000000
    val MIN_TRANSFER_AMOUNT = 100

    fun checkTransfer(amount:Double): String {
        return when{
            amount > MAX_TRANSFER_AMOUNT -> {
                "la transaccion exedfe el monto pemitido"
            }
            amount < MIN_TRANSFER_AMOUNT -> {
                "Elmoto minimo de la transacion es $MIN_TRANSFER_AMOUNT"
            }
            else -> {
                doTranfer(amount)
                "La transferencia se izo correctamente"
            }
        }
    }
    private fun doTranfer(amount: Double){

    }
}