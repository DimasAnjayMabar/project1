package com.example.test.ui.tiga

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Nomor3ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Nomor 3"
    }
    val text: LiveData<String> = _text
}