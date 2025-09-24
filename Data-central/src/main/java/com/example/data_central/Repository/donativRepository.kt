package com.example.data_central.Repository

import com.example.data_central.Dao.donativoDao
import com.example.data_central.Donativo.Donativo
import kotlinx.coroutines.flow.Flow

class donativRepository(

    private val donativoDao: donativoDao,

) {

    fun getAlldonativos(): Flow<List<Donativo>> = donativoDao.getAllNotes()

    suspend fun insert(donativo: Donativo){
        donativoDao.insertDonativo(donativo)

    }

    suspend fun delete(donativo: Donativo){
        donativoDao.deleteDonativo(donativo)

    }

    suspend fun update(donativo: Donativo){
        donativoDao.updateDonativo(donativo)
    }
}
