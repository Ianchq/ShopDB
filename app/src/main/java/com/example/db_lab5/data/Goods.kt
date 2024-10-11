package com.example.db_lab5.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="Goods")
data class Goods(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val type: String,
    val price: String,
    val id_supp: String,
    val id_client: String,
    val id_vend: String
)


