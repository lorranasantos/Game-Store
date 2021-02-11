package com.example.testefragment.data.dao

import android.content.Context
import com.example.testefragment.R
import com.example.testefragment.model.Console

class ConsoleDataSource {
    companion object{
        fun getConsoles(Context: Context): ArrayList<Console>{
            var consoles = ArrayList<Console>()

            consoles.add(Console(1,  Context.getDrawable(R.drawable.playstationone)!!, "PlayStation 1", " Sony", "28-11-1996"))
            consoles.add(Console(2,  Context.getDrawable(R.drawable.playsatationdois)!!, "PlayStation 2", " Sony", "28-11-2004"))
            consoles.add(Console(3,  Context.getDrawable(R.drawable.nintendo64)!!, "Nintendo 64", "Nintendo", "28-11-2000"))

            return consoles
        }
    }
}