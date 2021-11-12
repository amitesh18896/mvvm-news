package com.pallaw.mvvmnews.ui.breaking

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is breaking news Fragment"
    }
    val text: LiveData<String> = _text
}