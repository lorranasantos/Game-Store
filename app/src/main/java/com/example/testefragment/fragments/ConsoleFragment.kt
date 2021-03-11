package com.example.testefragment.fragments

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.*
import android.view.View.OnClickListener
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testefragment.R
import com.example.testefragment.adapter.ConsoleAdapter
import com.example.testefragment.data.dao.ConsoleDataSource
import com.example.testefragment.model.Console


class ConsoleFragment() : Fragment(), OnClickListener {

   private lateinit var recyclerConsole: RecyclerView
   private val consoleAdapter = ConsoleAdapter()
   private var consoleList = listOf<Console>()
    private lateinit var buttonAddConsole: ImageButton

    constructor(parcel: Parcel) : this() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_console, container, false)

        recyclerConsole = view.findViewById(R.id.recycler_view_consoles)

        recyclerConsole.layoutManager = LinearLayoutManager(view.context)

        recyclerConsole.adapter = consoleAdapter

       // consoleList = ConsoleDataSource.getConsoles(view.context)

        consoleAdapter.updateConsoleList(consoleList)

        buttonAddConsole = view.findViewById(R.id.button_add_consoles)
        buttonAddConsole.setOnClickListener(this)
        recyclerConsole = view.findViewById(R.id.recycler_view_consoles)

        return  view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)


    }
}