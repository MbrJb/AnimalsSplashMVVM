package com.example.animalssplashmvvm.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.animalssplashmvvm.databinding.ActivityMainBinding
import com.example.animalssplashmvvm.model.AnimalList
import com.example.animalssplashmvvm.adapter.MainAdapter
import com.example.animalssplashmvvm.viewmodel.MainActivityViewModel


class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MainAdapter(AnimalList.animalList)
        binding?.AnimasRecyclerView?.adapter = adapter

        var activityViewModel: MainActivityViewModel =
            ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        activityViewModel.getRecyclerListDataObserver().observe(this, Observer{


        })

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },3000)


    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }




}
