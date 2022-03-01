package com.example.animalssplashmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.animalssplashmvvm.model.Animal


class MainActivityViewModel: ViewModel() {

    lateinit var recyclerListData: MutableLiveData<ArrayList<Animal>>

    init {
        recyclerListData = MutableLiveData()
    }

    fun getRecyclerListDataObserver(): MutableLiveData<ArrayList<Animal>> {
        return recyclerListData
    }
    
}