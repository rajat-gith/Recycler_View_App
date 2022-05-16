package com.example.test_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.recyclerviewapp.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view_items.layoutManager=LinearLayoutManager(this)
        val itemAdapter=ItemAdapter(this,getItemlist())
        recycler_view_items.adapter=itemAdapter
    }
    private fun getItemlist():ArrayList<String>{
        val list=ArrayList<String>()
        for( i in 1..15){
            list.add("Item $i")
        }
        return list
    }
}