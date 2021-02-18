package com.example.testefragment.data.dao

import android.content.Context
import com.example.testefragment.R
import com.example.testefragment.model.Console

class ConsoleDataSource {
    companion object{
        fun getConsoles(Context: Context): ArrayList<Console>{
            var consoles = ArrayList<Console>()

            consoles.add(Console(1,  Context.getDrawable(R.drawable.playstationone)!!, "PlayStation 1", " Sony", "28-11-1996"))
            consoles.add(Console(2,  Context.getDrawable(R.drawable.playsatationdois)!!, "PlayStation 2", " Sony", "04-03-2000"))
            consoles.add(Console(3,  Context.getDrawable(R.drawable.xboxseriess)!!, "Xbox Series S", "Microsoft", "08-09-2020"))
            consoles.add(Console(4,  Context.getDrawable(R.drawable.segadreamcast)!!, "Dreamcast", "Sega", "27-11-1998"))
            consoles.add(Console(5,  Context.getDrawable(R.drawable.playstationfive)!!, "PlayStation 5", "Sony", "28-11-2020"))
            consoles.add(Console(6,  Context.getDrawable(R.drawable.nintendo64)!!, "Nintendo 64", "Nintendo", "19-11-2000"))

            return consoles
        }
    }
}