package com.raywenderlich.listmaster.listcategory

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao // взаимодествует с Entity
interface ListCategoryDao {
    @Query("SELECT * FROM list_categories")
    fun getAll(): List<ListCategory> // запрос с параметрами и возврат List<ListCategory>

    @Insert // вставка в БД
    fun insertAll(vararg listCategories: ListCategory)

}