package com.example.roomguideapplication

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {
    @Upsert
    suspend fun upsertContact(contact:Contact)

    @Delete
    suspend fun deleteContact(contact:Contact)

    @Query("SELECT * FROM contact ORDER BY FirstName ASC")
    fun getContactListFirstName():Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY LastName ASC")
    fun getContactListLastName():Flow<List<Contact>>

    @Query("SELECT * FROM contact ORDER BY PhoneNumber ASC")
    fun getContactListPhoneNumber():Flow<List<Contact>>
}