package com.example.davaleba13


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.davaleba13.databinding.ItemRecyclerviewBinding

class ItemsRecyclerAdapter :
    ListAdapter<ParentItem, ItemsRecyclerAdapter.ItemViewHolder>(object :
        DiffUtil.ItemCallback<ParentItem>() {
        override fun areItemsTheSame(oldItem: ParentItem, newItem: ParentItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ParentItem, newItem: ParentItem): Boolean {
            return oldItem == newItem
        }
    }) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemRecyclerviewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ItemViewHolder(var binding: ItemRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val childAdapter = ChildAdapter()

        init {
            binding.recyclerView.layoutManager = LinearLayoutManager(binding.root.context)
            binding.recyclerView.adapter = childAdapter
        }

        fun bind(parentItem: ParentItem) {

            childAdapter.submitList(parentItem.mList)
        }
    }
}




