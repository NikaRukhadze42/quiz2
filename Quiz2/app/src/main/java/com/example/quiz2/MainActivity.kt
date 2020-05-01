package com.example.quiz2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<UserModel>()
    private lateinit var adapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init(){
        adapter = RecyclerViewAdapter(items)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        setData()
    }

    private fun setData()
    {
        items.add(UserModel("Nika","Rukhadze", "nikarukhadze.n@gmail.com"))
        items.add(UserModel("Sandro","Tsivtsivadze", "sandro.ts24@gmail.com"))
        items.add(UserModel("Beka","Tevdorashvili", "tevdorashvili.b@gmail.com"))
    }

}

