package com.ivorycloud.dagger_hilt

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named



class MainViewModel @ViewModelInject constructor(@Named ("string2") teststring: String) : ViewModel() {

    init {
        Log.d("view model", "testString $teststring")
    }
}