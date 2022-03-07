package com.luizcorrea.recyclerviewex.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.luizcorrea.recyclerviewex.R

class ClientRecyclerViewAdapter : RecyclerView.Adapter<ClientRecyclerViewAdapter.ViewHolder>(){

    //mock
    private var names = arrayOf("Name 1","Name 2","Name 3","Name 4","Name 5","Name 6","Name 7")
    private var numbers = arrayOf("01 12345-1234","02 12345-1234","03 12345-1234","04 12345-1234","05 12345-1234","07 12345-1234","08 12345-1234")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val view  = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_client, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemName.text = names[position]
        holder.itemNumber.text = numbers[position]
    }

    override fun getItemCount(): Int {
        return names.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemName: TextView
        var itemNumber: TextView

        init {
            itemName = itemView.findViewById(R.id.tv_client_name)
            itemNumber = itemView.findViewById(R.id.tv_client_number)

            itemView.setOnClickListener {
                val position: Int = adapterPosition

                Toast.makeText(
                    itemView.context, "you clicked on ${names[position]}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

    }
}