package com.example.testefragment.data.dao

import android.content.Context
import com.example.testefragment.R
import com.example.testefragment.model.Console
import com.example.testefragment.model.Game

class GameDataSource {

    companion object{
        fun getGames(Context : Context) : ArrayList<Game>{
            var games = ArrayList<Game>()


            games.add(Game(1, "Mortal Kombat", Context.getDrawable(R.drawable.mortal)!!, "Mortal Kombat é um jogo bem legal e antigo", 3.5f,
                            listOf(
                                Console(1, Context.getDrawable(R.drawable.playstationone)!!, "PlayStation 1", "Sony", "1996-12-01")
                            ))

            )
            games.add(Game(2, "Crash Bandicoot", Context.getDrawable(R.drawable.crash)!!, "Crash Bandicoot é uma série de jogos criada por Andy Gavin e Jason Rubin, fundadores da Naughty Dog. A série consiste basicamente nas aventuras do bandicoot geneticamente alterado Crash, que luta para impedir o planos do cientista do mal Neo Córtex e seus lacaios.", 4.5f,
                listOf(
                    Console(1, Context.getDrawable(R.drawable.playstationone)!!, "PlayStation 2", "Sony", "1996-12-01"),
                    Console(2, Context.getDrawable(R.drawable.playstationone)!!,  "Nintendo", "Nintendo", "1999-12-04"),
                    Console(3, Context.getDrawable(R.drawable.playstationone)!!,"Xbox", "Microsoft", "2003-12-04")
                ))

            )
            games.add(Game(3, "Scooby-Doo", Context.getDrawable(R.drawable.scooby)!!, "Scooby-Doo é um jogo bem legal ", 3.0f,
                listOf(
                    Console(1,  Context.getDrawable(R.drawable.playstationone)!!,"PlayStation 2", "Sony", "1996-12-01"),
                    Console(2, Context.getDrawable(R.drawable.playstationone)!!,"Super Nintendo", "Nintendo", "1999-12-04")
                ))

            )
            games.add(Game(4, "Escape from Tarkov", Context.getDrawable(R.drawable.tarkov)!!, "Escape from Tarkov é um videogame de tiro em primeira pessoa que está sendo desenvolvido pelo estúdio russo Battlestate Games. Um alfa fechado do jogo foi disponibilizado para usuários selecionados em 28 de dezembro de 2016.", 4.5f,
                listOf(
                    Console(1, Context.getDrawable(R.drawable.playstationone)!!,"PlayStation 2", "Sony", "1996-12-01"),
                    Console(2, Context.getDrawable(R.drawable.playstationone)!!,"PC", "Dell", "1999-12-04"),
                    Console(3, Context.getDrawable(R.drawable.playstationone)!!,"Xbox One", "Microsoft", "2003-12-04"),
                    Console(4, Context.getDrawable(R.drawable.playstationone)!!,"SNas", "Microsoft", "2003-12-04")
                ))

            )
            games.add(Game(5, "Call of Duty", Context.getDrawable(R.drawable.cod)!!, "Call of Duty é uma série de jogos eletrônicos de guerra, ação e tiro em primeira pessoa publicado pela Activision e desenvolvida pela Infinity Ward, pela Sledgehammer Game Studio e pela Treyarch, com as empresas se revezando a cada lançamento.", 4.0f,
                listOf(
                    Console(1, Context.getDrawable(R.drawable.playstationone)!!,"PlayStation 2", "Sony", "1996-12-01"),
                    Console(2, Context.getDrawable(R.drawable.playstationone)!!,"Switch", "Switch", "1999-12-04")
                ))

            )
            games.add(Game(6, "Firewatch", Context.getDrawable(R.drawable.firewatch)!!, "Firewatch é um jogo eletrônico de aventura desenvolvido pela Campo Santo e publicado pela desenvolvedora em parceria com a Panic. O jogo foi lançado em fevereiro de 2016 para Microsoft Windows, OS X, Linux e PlayStation 4, para Xbox One em setembro de 2016 e para Nintendo Switch em dezembro de 2018.", 3.5f,
                listOf(
                    Console(1, Context.getDrawable(R.drawable.playstationone)!!,"PlayStation 2", "Sony", "1996-12-01"),
                    Console(2,Context.getDrawable(R.drawable.playstationone)!!, "Nintendo", "Nintendo", "1999-12-04"),
                    Console(3, Context.getDrawable(R.drawable.playstationone)!!,"Xbox-360", "Microsoft", "2003-12-04")
                ))

            )

                return games

        }

    }

}