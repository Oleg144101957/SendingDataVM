package com.example.fragmentvm.screens

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MyViewModel(application: Application) : AndroidViewModel(application) {

    val myLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }



}