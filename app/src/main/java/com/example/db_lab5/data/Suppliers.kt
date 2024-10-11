package com.example.db_lab5.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Suppliers")
data class Suppliers(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val type: String,
    val name: String,
    val id_employee: String
)

