package com.example.animalkingdom.adapter

import android.content.Context
import android.graphics.BitmapFactory
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.animalkingdom.R
import com.example.animalkingdom.model.Animal

class ItemAdapter(private val context: Context, private val dataset: List<Animal>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // خاصية onItemClick
    var onItemClick: ((Animal) -> Unit)? = null

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textview: TextView = view.findViewById(R.id.item_text)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textview.text = context.resources.getString(item.stringResourceId)

        try {
            val options = BitmapFactory.Options()
            options.inSampleSize = 4
            val bitmap = BitmapFactory.decodeResource(
                context.resources,
                item.imageResourceId,
                options
            )
            holder.imageView.setImageBitmap(bitmap)
        } catch (e: Exception) {
            Log.e("ItemAdapter", "Error loading image: ${e.message}")
        }

        // التعامل مع النقر
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(item)
        }
    }
}

