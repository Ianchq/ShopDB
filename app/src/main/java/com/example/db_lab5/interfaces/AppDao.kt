package com.example.db_lab5.interfaces

import androidx.room.Dao
import androidx.room.Query
import com.example.db_lab5.data.Clients
import com.example.db_lab5.data.Goods
import com.example.db_lab5.data.GoodsEmployees
import com.example.db_lab5.data.Suppliers
import com.example.db_lab5.data.Vendors

//@Dao
//interface AppDao {
//    @Query("Select * FROM Clients")
//    suspend fun getAllClients(): List<Clients>
//
//    @Query("Select * FROM Goods")
//    suspend fun getAllGoods(): List<Goods>
//
//    @Query("Select * FROM Suppliers")
//    suspend fun getAllSuppliers(): List<Suppliers>
//
//    @Query("Select * FROM GoodsEmployees")
//    suspend fun getAllGoodsEmployees(): List<GoodsEmployees>
//
//    @Query("Select * FROM Vendors")
//    suspend fun getAllVendors(): List<Vendors>
//}