package com.example.data_central.Donativo

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Donativo")
data class Donativo(
    @PrimaryKey val id: String,
    val nombre: String,
    val apellido: String,
    val email: String,
    val telefono: String,
    val producto: String,
    val rfc: String,
    val direccion: String? = null
) {
    fun toMap(): Map<String, Any?> = mapOf(
        "id" to id,
        "nombre" to nombre,
        "apellido" to apellido,
        "email" to email,
        "telefono" to telefono,
        "producto" to producto,
        "rfc" to rfc,
        "direccion" to direccion
    )

    companion object {
        fun fromMap(map: Map<String, Any?>): Donativo = Donativo(
            id = map["id"] as String,
            nombre = map["nombre"] as String,
            apellido = map["apellido"] as String,
            email = map["email"] as String,
            telefono = map["telefono"] as String,
            producto = map["producto"] as String,
            rfc = map["rfc"] as String,
            direccion = map["direccion"] as? String
        )
    }
}




