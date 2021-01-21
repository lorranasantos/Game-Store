package com.example.testefragment.data.dao

import android.content.Context
import com.example.testefragment.R
import com.example.testefragment.model.Console
import com.example.testefragment.model.Game

class GameDataSource {

    companion object{
        fun getGames(Context : Context) : ArrayList<Game>{
            var games = ArrayList<Game>()


            games.add(Game(1, "Mortal Kombat", Context.getDrawable(R.drawable.mortal)!!, "Mortal Kombat é um jogo bem legal e antigo", 4.5,
                            listOf(
                                Console(1, "PlayStation 1", "Sony", "1996-12-01")))

            )
            games.add(Game(2, "Crash Bandicoot", Context.getDrawable(R.drawable.crash)!!, "Crash Bandicoot é um jogo bem legal ", 4.5,
                listOf(
                    Console(1, "PlayStation 2", "Sony", "1996-12-01"),
                    Console(2, "Nintendo", "Nintendo", "1999-12-04"),
                    Console(3, "Xbox", "Microsoft", "2003-12-04")))

            )
            games.add(Game(3, "Scooby-Doo", Context.getDrawable(R.drawable.scooby)!!, "Scooby-Doo é um jogo bem legal ", 4.5,
                listOf(
                    Console(1, "PlayStation 2", "Sony", "1996-12-01"),
                    Console(2, "Nintendo", "Nintendo", "1999-12-04")
                ))

            )

                return games

        }

    }

}