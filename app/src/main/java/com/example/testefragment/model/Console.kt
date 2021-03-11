package com.example.testefragment.model

import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Console(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "image")
    var consoleImage: String,

    @ColumnInfo(name = "name")
    var consoleName: String,

    @ColumnInfo(name = "maker")
    var consoleMaker: String,

    @ColumnInfo(name = "release")
    var consoleReleaseDate: String

)