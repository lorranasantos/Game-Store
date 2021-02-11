package com.example.testefragment.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testefragment.R
import com.example.testefragment.model.Console
import kotlinx.android.synthetic.main.holder_console_layout.view.*

class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val textConsoleName = itemView.findViewById<TextView>(R.id.text_view_console_name)
    val consoleImage = itemView.findViewById<ImageView>(R.id.image_console)
    val textConsoleMaker = itemView.findViewById<TextView>(R.id.text_view_console_maker)
    val textConsoleRelease = itemView.findViewById<TextView>(R.id.text_view_console_release)

    fun bind(console: Console){
        textConsoleName.text = console.consoleName
        textConsoleMaker.text = console.consoleMaker
        textConsoleRelease.text = console.consoleReleaseDate
        consoleImage.setImageDrawable(console.consoleImage)
    }


}