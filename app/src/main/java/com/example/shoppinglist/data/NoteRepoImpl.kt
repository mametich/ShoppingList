package com.example.shoppinglist.data

import kotlinx.coroutines.flow.Flow

class NoteRepoImpl(
    private val noteDao: NoteDao
) : NoteRepository {
    override suspend fun insertItem(item: NoteItem) {
        noteDao.insertItem(item)
    }

    override suspend fun deleteItem(item: NoteItem) {
        noteDao.deleteItem(item)
    }

    override fun getAllItems(): Flow<List<NoteItem>> {
        return noteDao.getAllItems()
    }

    override suspend fun getNoteItemById(id: Int): NoteItem {
        return noteDao.getNoteItemById(id)
    }
}