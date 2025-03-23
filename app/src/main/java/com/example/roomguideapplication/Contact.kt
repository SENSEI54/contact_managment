package com.example.roomguideapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id:Int? = null,
    val FirstName:String,
    val LastName:String,
    val PhoneNumber:String
)
