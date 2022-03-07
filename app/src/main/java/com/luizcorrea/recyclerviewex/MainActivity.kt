package com.luizcorrea.recyclerviewex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.luizcorrea.recyclerviewex.adapter.ClientRecyclerViewAdapter

class MainActivity: AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ClientRecyclerViewAdapter.ViewHolder>? = null
    private val addClientActivity = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager

        adapter = ClientRecyclerViewAdapter()
        recyclerView.adapter = adapter

        val fab: View = findViewById(R.id.addClient)
        fab.setOnClickListener {
            fabOnClick()
        }


    }

    /* Add when FAB is clicked. */
    private fun fabOnClick() {
        val intent = Intent(this, AddClientActivity::class.java)
        startActivityForResult(intent, addClientActivity)
    }
}