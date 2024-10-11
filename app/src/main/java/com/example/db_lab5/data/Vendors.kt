package com.example.db_lab5.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Vendors")
data class Vendors(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val phone: String,
    val id_supp: String
)

