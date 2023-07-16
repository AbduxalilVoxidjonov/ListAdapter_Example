package com.example.listadapterapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.listadapterapplication.databinding.ItemListAdapterBinding

class MyCustomAdapter(): ListAdapter<String, MyCustomAdapter.myCustomAdapter>(MyCustomDiffUtil()) {

    inner class  myCustomAdapter(val binding: ItemListAdapterBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(text: String) {
            binding.tvItem.text = text
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myCustomAdapter {
        return myCustomAdapter(ItemListAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: myCustomAdapter, position: Int) {
        holder.bind(getItem(position))
    }
}

private class MyCustomDiffUtil :DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}
