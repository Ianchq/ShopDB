package com.example.db_lab5.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="GoodsEmployees")
data class GoodsEmployees(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val id_employee: String,
    val id_goods: String
)

