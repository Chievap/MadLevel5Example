package com.example.madlevel2example

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reminderTable")
data class Reminder(var reminder: String) {
    @ColumnInfo(name = "reminder")
    var reminderText: String = reminder

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
}