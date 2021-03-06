package com.example.nizar.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.nizar.coderswag.Model.Catagory
import com.example.nizar.coderswag.R
import com.example.nizar.coderswag.R.id.categoryName
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryRecycleAdapter(val context: Context, val categories: List<Catagory>,val itemClick:(Catagory) -> Unit):RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position],context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent?.context).inflate(
            R.layout.category_list_item,parent,false
        )

        return Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }


    inner  class Holder(itemView: View, val itemClick: (Catagory) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Catagory, context: Context){
            val resourceID =context.resources.getIdentifier(category.image,
                "drawable",
                context.packageName)

            categoryImage?.setImageResource(resourceID)
            categoryName?.text =category.title
            itemView.setOnClickListener{itemClick(category)}

        }
    }// end of class Holder

}