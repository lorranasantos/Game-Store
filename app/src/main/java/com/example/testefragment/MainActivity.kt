package com.example.testefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.testefragment.fragments.ConsoleFragment
import com.example.testefragment.fragments.GameFragment
import com.example.testefragment.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testefragment.adapter.ConsoleAdapter
import com.example.testefragment.dao.Database
import com.example.testefragment.model.Console

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

    private lateinit var toolbar: Toolbar
    private lateinit var dialog: AlertDialog

    private lateinit var drawer: DrawerLayout

    private lateinit var buttonAddConsole: ImageButton
    private lateinit var editNomeConsole: EditText
    private lateinit var editMakerConsole: EditText
    private lateinit var editConsoleRelease: EditText
    private lateinit var editConsoleImage: EditText
    private lateinit var buttonSaveConsole: Button
    private lateinit var buttonCancelConsole: Button
    private lateinit var recyclerConsole: RecyclerView


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

        toolbar = findViewById(R.id.toolbar)
        toolbar.setTitle("Home")
       //setTitle ou = toolbar.title="Home" ambos dão no mesmo, mas é melhor o .title
        setSupportActionBar(toolbar)


        drawer = findViewById(R.id.drawer)

        //**Adicionar o botão que abre o drawer menu
        var toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.open_drawer, R.string.close_drawer)

        drawer.addDrawerListener(toggle)
        toggle.syncState()

        setFragment(homeFragment)
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



//        if(v.id == R.id.button_add_consoles){
//            abrirCadastroConsoles()
//        }else if(v.id == R.id.button_cancel_console){
//            dialog.dismiss()
//        }else if(v.id == R.id.button_save_console){
//            salvarConsole()
//        }else{
//            exibirConsole()
//        }
    }

    private fun exibirConsole() {
        //val consoleDao = Database.getDatabase(this).consoleDao()
        // val console = consoleDao.listarTodos()

        recyclerConsole.layoutManager = LinearLayoutManager(this)

        val adapter = ConsoleAdapter()
        //adapter.updateConsoleList(console)

        recyclerConsole.adapter = adapter
    }

    private fun salvarConsole() {
        var console = Console(0, editConsoleImage.text.toString(), editNomeConsole.text.toString(), editMakerConsole.text.toString(), editConsoleRelease.text.toString())

        val consoleDao = Database.getDatabase(this).consoleDao()
        consoleDao.salvar(console)

        exibirConsole()
        dialog.dismiss()
    }

    private fun abrirCadastroConsoles() {
        val alertDialog = AlertDialog.Builder(this)
        val inflater = layoutInflater

        val view = inflater.inflate(R.layout.cadastro_consoles, null)
        alertDialog.setView(view)

        editNomeConsole = view.findViewById(R.id.edit_console_name)
        editConsoleRelease = view.findViewById(R.id.edit_console_release)
        editMakerConsole = view.findViewById(R.id.edit_console_maker)
        editConsoleImage = view.findViewById(R.id.edit_console_image)

        buttonSaveConsole = view.findViewById(R.id.button_save_console)
        buttonCancelConsole = view.findViewById(R.id.button_cancel_console)

        dialog = alertDialog.create()
        dialog.setCancelable(false)
        dialog.show()

        buttonCancelConsole.setOnClickListener(this)
        buttonSaveConsole.setOnClickListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_home -> {
                toolbar.title="Home"
                setFragment(homeFragment)
            }
            R.id.menu_console -> {
                toolbar.title="Consoles"
                setFragment(consoleFragment)
            }
            R.id.menu_game -> {
                toolbar.title="Games"
                setFragment(gameFragment)
            }
        }

        // *** Selecionar o item de menu no BottomNavigationView
        var selectedMenu = bottomNavigation.menu.findItem(item.itemId)
        selectedMenu.setChecked(true)

        // *** Fechar o drawer se ele estiver aberto
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }

        return true
    }
    fun setFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame,fragment).commit()

    }



}