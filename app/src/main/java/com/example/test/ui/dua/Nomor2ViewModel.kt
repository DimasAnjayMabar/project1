package com.example.test.ui.dua

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Nomor2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Nomor 2"
    }
    val text: LiveData<String> = _text
}