package com.example.data_central.Model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data_central.Donativo.Donativo
import com.example.data_central.Repository.donativRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class DonativoViewModel(private val repository: donativRepository) : ViewModel() {


    private val _donativos = MutableStateFlow<List<Donativo>>(emptyList())
    val donativos: StateFlow<List<Donativo>> = _donativos.asStateFlow()


    init {
        viewModelScope.launch {
            repository.getAlldonativos().collectLatest { donativosFromDb ->
                _donativos.value = donativosFromDb
            }
        }
    }



    fun addDonativo(donativo: Donativo) {
        viewModelScope.launch {
            repository.insert(donativo)
        }
    }


    fun deleteDonativo(donativo: Donativo) {
        viewModelScope.launch {
            repository.delete(donativo)
        }
    }


    fun updateDonativo(donativo: Donativo) {
        viewModelScope.launch {
            repository.update(donativo)
        }

    }
}