package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.gerencia.*

class Gerencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.getSupportActionBar()?.hide()
        setContentView(R.layout.gerencia)


       btnMenu.setOnClickListener {
            showPopup(btnMenu)
        }
    }
    private fun showPopup(view: View) {
        val popup = PopupMenu(this, view)
        popup.inflate(R.menu.menu_lateral)

        popup.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item: MenuItem? ->

            when (item!!.itemId) {
                R.id.opcao1 -> {
                    Toast.makeText(this@Gerencia, item.title, Toast.LENGTH_SHORT).show()
                }
                R.id.opcao2 -> {
                    Toast.makeText(this@Gerencia, item.title, Toast.LENGTH_SHORT).show()
                }
                           }

            true
        })

        popup.show()
    }
}

