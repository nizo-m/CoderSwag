package com.example.nizar.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.nizar.coderswag.Adapters.CategoryAdapter
import com.example.nizar.coderswag.Model.Catagory
import com.example.nizar.coderswag.R
import com.example.nizar.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.catagories )

        categoryListView.adapter =adapter

    }// end of OnCreate


}
