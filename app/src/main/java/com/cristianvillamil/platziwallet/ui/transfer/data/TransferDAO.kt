package com.cristianvillamil.platziwallet.ui.transfer.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
@Dao
abstract interface TransferDAO {
    @Query("SELECT * FROM transfer WHERE 1")
    fun getAll():List<TransferEntity>
    @Query("SELECT * FROM transfer WHERE user_name LIKE :username ")
    fun findTranferByUserNAme(username:String):List<TransferEntity>
    @Insert
    fun saveTranfer(tranfer:TransferEntity)
    @Delete
    fun delete(tranfer: TransferEntity)
}