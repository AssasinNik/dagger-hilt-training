package com.example.dagger_hilt_training.presentation

import androidx.lifecycle.ViewModel
import com.example.dagger_hilt_training.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
):ViewModel() {

}