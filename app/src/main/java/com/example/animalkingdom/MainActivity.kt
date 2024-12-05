package com.example.animalkingdom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.animalkingdom.adapter.ItemAdapter
import com.example.animalkingdom.data.DataSource
// This code is written by Rahaf faiz
class MainActivity : AppCompatActivity() {
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize data
        val myDataset = DataSource().loadAnimals()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        itemAdapter = ItemAdapter(this, myDataset)
        recyclerView.adapter = itemAdapter

        recyclerView.setHasFixedSize(true)

        itemAdapter.onItemClick = {
            val intent = Intent(this, NewActivity::class.java)
            intent.putExtra("animal", it)
            this.startActivity(intent)
        }

    }
}