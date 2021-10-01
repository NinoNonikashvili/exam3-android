package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample.databinding.ActivityMainBinding

class UsersActivity : AppCompatActivity()
{
    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()
        binding.recyclerView.adapter = ExampleAdapter(setUp())
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)





    }


    fun setUp() :ArrayList<ExampleItem>{
        val list = ArrayList<ExampleItem>()

        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))
        list.add(ExampleItem("name", "lastname", "email"))



        return list
    }

}