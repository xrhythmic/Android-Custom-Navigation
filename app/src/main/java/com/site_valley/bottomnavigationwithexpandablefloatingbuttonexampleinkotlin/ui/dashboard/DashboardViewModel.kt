package com.site_valley.bottomnavigationwithexpandablefloatingbuttonexampleinkotlin.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is List View Fragment"
    }
    val text: LiveData<String> = _text
}