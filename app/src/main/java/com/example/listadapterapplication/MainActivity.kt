package com.example.listadapterapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadapterapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listAdapter= MyCustomAdapter()
       binding.recyclerView.apply {
           adapter= listAdapter
           layoutManager= LinearLayoutManager(this@MainActivity)
       }

        val list  = mutableListOf<String>()
        for (i in 1..100) {
            list.add("Item number = $i")
        }
        listAdapter.submitList(list)
    }
}