package com.example.shoppingapp.viewholder


import com.example.shoppingapp.ListAdapter
import com.example.shoppingapp.databinding.ItemViewpagerBinding
import com.example.shoppingapp.model.ListItem
import com.example.shoppingapp.model.ViewPager

class ViewPagerViewHolder(
    binding : ItemViewpagerBinding
) : BindingViewHolder<ItemViewpagerBinding>(binding){

    private val adapter = ListAdapter()

    init {
        binding.viewpager.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as ViewPager
        adapter.submitList(item.items)
    }
}