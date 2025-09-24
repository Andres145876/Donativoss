package com.example.data_central.Repository

import com.example.data_central.Dao.donativoDao
import com.example.data_central.Donativo.Donativo
import kotlinx.coroutines.flow.Flow

class donativRepository(
    private val donativoDao: donativoDao,
    private val firebaseService: FirebaseService = FirebaseService()  // <-- agregar
) {

    fun getAlldonativos(): Flow<List<Donativo>> = donativoDao.getAllNotes()

    suspend fun insert(donativo: Donativo){
        donativoDao.insertDonativo(donativo)
        try {
            firebaseService.uploaddonativo(donativo)
        } catch (e: Exception) {
            // manejar error si falla Firebase
        }
    }

    suspend fun delete(donativo: Donativo){
        donativoDao.deleteDonativo(donativo)
        try {
            firebaseService.uploaddonativo(donativo)
        } catch (e: Exception) {
            // manejar error si falla Firebase
        }
    }

    suspend fun update(donativo: Donativo){
        donativoDao.updateDonativo(donativo)
    }
}
