package com.example.testefragment.model

import android.graphics.drawable.Drawable

data class Console(
    var id: Long,
    var consoleImage: Drawable,
    var consoleName: String,
    var consoleMaker: String,
    var consoleReleaseDate: String

)