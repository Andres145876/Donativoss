package com.example.data_central.Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data_central.Dao.donativoDao
import com.example.data_central.Donativo.Donativo



@Database
    (entities = [Donativo::class],
    version = 1,
    exportSchema = false)

abstract class DonativoDatabase : RoomDatabase() {
    abstract fun donativoDao(): donativoDao
}