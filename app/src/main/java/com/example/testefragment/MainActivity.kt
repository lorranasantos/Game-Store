package com.example.testefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.testefragment.fragments.ConsoleFragment
import com.example.testefragment.fragments.GameFragment
import com.example.testefragment.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener{

//    private lateinit var buttonHome: Button
//
//    private lateinit var  buttonConsole: Button
//    private lateinit var buttonGame: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var gameFragment: GameFragment
    private lateinit var consoleFragment: ConsoleFragment

    private lateinit var bottomNavigation: BottomNavigationView

    private lateinit var navigationView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_navigation_layout)

//        buttonHome = findViewById(R.id.button_home)
//        buttonHome.setOnClickListener(this)
//
//        buttonConsole = findViewById(R.id.button_console)
//        buttonConsole.setOnClickListener(this)
//
//        buttonGame = findViewById(R.id.button_game)
//        buttonGame.setOnClickListener(this)


        homeFragment = HomeFragment()
        gameFragment = GameFragment()
        consoleFragment = ConsoleFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        navigationView = findViewById(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener(this)


        supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()
    }

    override fun onClick(v: View) {
//        when(v.id) {
//            R.id.button_home -> {
//                supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()
//            }
//            R.id.button_console -> {
//                supportFragmentManager.beginTransaction().replace(R.id.frame, consoleFragment).commit()
//            }
//            R.id.button_game -> {
//                supportFragmentManager.beginTransaction().replace(R.id.frame, gameFragment).commit()
//            }
//        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_home -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame, homeFragment).commit()
            }
            R.id.menu_console -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame, consoleFragment).commit()
            }
            R.id.menu_game -> {
                supportFragmentManager.beginTransaction().replace(R.id.frame, gameFragment).commit()
            }
        }
        return true
    }


}