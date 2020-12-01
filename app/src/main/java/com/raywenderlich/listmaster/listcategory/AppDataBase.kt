package com.raywenderlich.listmaster.listcategory

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ListCategory::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun listCategoryDao(): ListCategoryDao
}