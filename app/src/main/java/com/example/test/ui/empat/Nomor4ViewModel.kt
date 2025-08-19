package com.example.test.ui.satu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Nomor4ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Nomor 4"
    }
    val text: LiveData<String> = _text
}