package com.example.davaleba13

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.davaleba13.databinding.ChildItemBinding


class ChildAdapter : ListAdapter<DataSubListItem, ChildAdapter.ChildViewHolder>(object :
    DiffUtil.ItemCallback<DataSubListItem>() {
    override fun areItemsTheSame(oldItem: DataSubListItem, newItem: DataSubListItem): Boolean {
        return oldItem.field_id == newItem.field_id
    }

    override fun areContentsTheSame(oldItem: DataSubListItem, newItem: DataSubListItem): Boolean {
        return oldItem == newItem
    }
}) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val binding = ChildItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ChildViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ChildViewHolder(private var binding: ChildItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: DataSubListItem) {
            binding.editText1.hint = item.hint
            binding.imageView1.setImageResource(item.icon1)

            binding.imageView1.setOnClickListener{

                if (item.required){
                    if(binding.editText1.text.isNullOrEmpty()){
                        Toast.makeText(itemView.context, "ინფორმაცია აუცილებელია", Toast.LENGTH_LONG).show()
                    }
                }
            }


        }
    }
}
