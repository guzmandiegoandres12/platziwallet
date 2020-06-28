package com.cristianvillamil.platziwallet

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.cristianvillamil.platziwallet.ui.commands.FileCommandsManager
import com.cristianvillamil.platziwallet.ui.commands.ReadCommand
import com.cristianvillamil.platziwallet.ui.commands.SaveCommand

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)
        val commandsManager= FileCommandsManager()
        val saveComand= SaveCommand()
        val readComand= ReadCommand()
        commandsManager.putCommand("saveComand",saveComand)
        commandsManager.putCommand("readComand",readComand)

        commandsManager.gerCommand("saveComand").execute(this,"samblefil","hola mundo" ,"plaziWalet")
        commandsManager.gerCommand("readComand").execute(this,"samblefil")
    }
}
