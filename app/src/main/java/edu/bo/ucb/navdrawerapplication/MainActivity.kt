package edu.bo.ucb.navdrawerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        setConfigDrawer()
    }

    fun setConfigDrawer() {
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        val main_drawer_layout = findViewById(R.id.main_drawer_layout) as DrawerLayout
        var drawerToggle = ActionBarDrawerToggle(this, main_drawer_layout, toolbar, 0,0)
        main_drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
    }

}