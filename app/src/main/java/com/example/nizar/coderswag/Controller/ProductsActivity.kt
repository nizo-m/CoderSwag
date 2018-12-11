package com.example.nizar.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nizar.coderswag.R
import com.example.nizar.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType=intent.getStringExtra(EXTRA_CATEGORY)
        println("THIS IS PRODUCTS ACTIVITY   ..   "+categoryType)
    }
}
