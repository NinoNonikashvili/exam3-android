package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.nio.file.Files.delete


class ExampleAdapter(private val exampleList: List<ExampleItem>) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_item,
        parent, false)
        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.name.text = currentItem.name
        holder.lastName.text = currentItem.lastName
        holder.email.text = currentItem.email
        holder.delete.setOnClickListener{ }




    }

    override fun getItemCount(): Int  = exampleList.size

    class ExampleViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.name)
        val lastName: TextView = itemView.findViewById(R.id.lastname)
        val email: TextView = itemView.findViewById(R.id.email)
        val delete: Button = itemView.findViewById(R.id.email)
        val update: Button = itemView.findViewById(R.id.update)





    }
}