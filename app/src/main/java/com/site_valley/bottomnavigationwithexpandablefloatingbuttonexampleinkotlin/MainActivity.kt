package com.site_valley.bottomnavigationwithexpandablefloatingbuttonexampleinkotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.site_valley.bottomnavigationwithexpandablefloatingbuttonexampleinkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


        mainBinding.addFile.setOnClickListener {
            Toast.makeText(this, "Clicked Add File.", Toast.LENGTH_SHORT).show()
        }
        mainBinding.setting.setOnClickListener {
            Toast.makeText(this, "Clicked Setting.", Toast.LENGTH_SHORT).show()
        }
        mainBinding.addPeople.setOnClickListener {
            Toast.makeText(this, "Clicked Add People.", Toast.LENGTH_SHORT).show()
        }
        mainBinding.camera.setOnClickListener {
            Toast.makeText(this, "Clicked Camera.", Toast.LENGTH_SHORT).show()
        }
    }
}