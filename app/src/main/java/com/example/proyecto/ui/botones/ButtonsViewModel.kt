package com.example.proyecto.ui.botones

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ButtonsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Hola botones"
    }
    val text: LiveData<String> = _text
}