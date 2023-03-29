package com.example.shoppingapp.viewholder

import com.example.shoppingapp.ListAdapter
import com.example.shoppingapp.databinding.ItemHorizontalBinding
import com.example.shoppingapp.model.Horizontal
import com.example.shoppingapp.model.ListItem

class HorizontalViewHolder(
    private val binding : ItemHorizontalBinding
) : BindingViewHolder<ItemHorizontalBinding>(binding){
    private val adapter = ListAdapter()

    init {
        binding.listView.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as Horizontal
        binding.titleTextView.text = item.title
        adapter.submitList(item.items)
    }
}