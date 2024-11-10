package com.example.shoppinglist.data

import kotlinx.coroutines.flow.Flow

class ShoppingListRepoImpl(
    private val shoppingListDao: ShoppingListDao
) : ShoppingListRepository {
    override suspend fun insertItem(item: ShoppingListItem) {
        shoppingListDao.insertItem(item)
    }

    override suspend fun deleteItem(item: ShoppingListItem) {
        shoppingListDao.deleteItem(item)
    }

    override fun getAllItems(): Flow<List<ShoppingListItem>> {
        return shoppingListDao.getAllItems()
    }
}