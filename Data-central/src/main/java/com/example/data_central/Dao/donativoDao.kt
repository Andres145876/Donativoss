package com.example.data_central.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.data_central.Donativo.Donativo
import kotlinx.coroutines.flow.Flow

@Dao
interface donativoDao{
    @Query("SELECT * FROM Donativo ORDER BY nombre ASC, apellido ASC, email ASC, telefono ASC, producto ASC, rfc ASC, direccion ASC")
    fun getAllNotes(): Flow<List<Donativo>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDonativo(donativo: Donativo)

    @Update
    suspend fun updateDonativo(donativo: Donativo)

    @Delete
    suspend fun deleteDonativo(donativo: Donativo)
}