package com.example.data_central.firebase

import com.example.data_central.Donativo.Donativo
import com.google.firebase.firestore.FirebaseFirestore

class FirebaseFuncService(
    private val firestore: FirebaseFirestore =   FirebaseFirestore.getInstance()
){
    private val collection = firestore.collection("donativo")



    suspend fun uploaddonativo(donativo: Donativo){
        collection.document(donativo.id.toString()).set(donativo)
    }
}