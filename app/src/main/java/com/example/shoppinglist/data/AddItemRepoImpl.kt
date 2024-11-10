package com.example.shoppinglist.data

import kotlinx.coroutines.flow.Flow

class AddItemRepoImpl(
    private val addItemDao: AddItemDao
) : AddItemRepository{
    override suspend fun insertItem(item: AddItem) {
        addItemDao.insertItem(item)
    }

    override suspend fun insertItem(item: ShoppingListItem) {
        addItemDao.insertItem(item)
    }

    override suspend fun deleteItem(item: AddItem) {
        addItemDao.deleteItem(item)
    }

    override fun getAllItemsById(listId: Int): Flow<List<AddItem>> {
        return addItemDao.getAllItemsById(listId)
    }

    override suspend fun getListItemById(listId: Int): ShoppingListItem {
        return addItemDao.getListItemById(listId)
    }
}