package com.example.shoppingapp.remote.repository

import androidx.paging.PagingData
import com.example.shoppingapp.model.ListItem
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun loadList() : Flow<PagingData<ListItem>>
}