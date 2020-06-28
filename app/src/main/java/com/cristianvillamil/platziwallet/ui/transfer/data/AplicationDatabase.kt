package com.cristianvillamil.platziwallet.ui.transfer.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [TransferEntity::class],version = 1)
abstract class AplicationDatabase : RoomDatabase(){
    abstract fun getDAO():TransferDAO
    companion object{
        private  var  INSTANCE:AplicationDatabase? = null
        fun GetAppDatabase(context: Context): AplicationDatabase?{
            if(INSTANCE == null){
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AplicationDatabase::class.java,
                    "platziWalletDatabase"
                ).allowMainThreadQueries()
                    .build()
            }
            return INSTANCE
        }
        fun destroyInstance(){
            INSTANCE = null
        }
    }


}