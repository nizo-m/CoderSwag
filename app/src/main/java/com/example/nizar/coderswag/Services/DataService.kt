package com.example.nizar.coderswag.Services

import com.example.nizar.coderswag.Model.Catagory
import com.example.nizar.coderswag.Model.Product

object DataService {

    val catagories = listOf(
        Catagory("SHIRTS","shirtimage"),
        Catagory("HOODIES","hoodieimage"),
        Catagory("HATS","hatimage"),
        Catagory("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes beanie","18$","hat01"),
        Product("Devslopes Hat black","15$","hat02"),
        Product("Devslopes Hat white","15$","hat03"),
        Product("Devslopes Hat snapback","20$","hat04")
    )

    val hoodies = listOf(
        Product("Devslope Hoddie Grey","28$","hoodie01"),
        Product("Devslope Hoddie Red","32$","hoodie02"),
        Product("Devslope Hoddie Yellow","32$","hoodie03"),
        Product("Devslope Hoddie Black","28$","hoodie04")
    )

    val shirts = listOf(
        Product("Devslope Shirt Black","18$","shirt01"),
        Product("Devslope Logo Shirt Red","22$","shirt02"),
        Product("Devslope Badge light Gray ","22$","shirt03"),
        Product("Devslope Hustle ","22$","shirt04"),
        Product("Kickflip Studios ","18$","shirt05")
    )
}