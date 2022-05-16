package com.recyclerviewapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.test_app.R
import kotlinx.android.synthetic.main.item_custom_row.view.*

class ItemAdapter(val context: Context,val items:ArrayList<String>):
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_custom_row,
                parent,
                false
            )
        )
    }
    //basically in a list the elements position is mentioned inside onBindViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=items.get(position)
        holder.tvItem.text=item
        if(position%2==0)
        {
            holder.cardViewItem.setBackgroundColor(
                ContextCompat.getColor(
                    context,
                    R.color.colorLightGray
                )

            )
        }
        else{
            holder.cardViewItem.setBackgroundColor(
                ContextCompat.getColor(
                    context,
                    R.color.colorWhite
                )

            )
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each item to
        val tvItem = view.tv_item_name
        val cardViewItem = view.card_view_item
    }

}

