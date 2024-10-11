package com.example.db_lab5.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Clients")
data class Clients(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val phone: String
)

