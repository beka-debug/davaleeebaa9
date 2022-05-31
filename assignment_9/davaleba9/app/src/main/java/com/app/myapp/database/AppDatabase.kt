package com.beka.mysuperapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.beka.mysuperapp.api.dto.Resource
import com.beka.mysuperapp.database.daos.ResourceDao

@Database(entities = [Resource::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getResourcesDao(): ResourceDao
}