package com.example.androidlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("***App state:onCreate***\n")
        Toast.makeText(
            applicationContext,"App state:onCreate",Toast.LENGTH_LONG
        ).show()

    }

    override fun onStart() {
        super.onStart()
        print("***App state:onStart***\n")
        Toast.makeText(
            applicationContext,"App state:onStart",Toast.LENGTH_LONG
        ).show()
    }

    override fun onRestart() {
        super.onRestart()
        print("***App state:onRestart***\n")
        Toast.makeText(
            applicationContext,"App state:onRestart",Toast.LENGTH_LONG
        ).show()
    }

    override fun onResume() {
        super.onResume()
        print("***App state:onResume***\n")
        Toast.makeText(
            applicationContext,"App state:onResume",Toast.LENGTH_LONG
        ).show()
    }

    override fun onPause() {
        super.onPause()
        print("***App state:onPause***\n")
        Toast.makeText(
            applicationContext,"App state:onPause",Toast.LENGTH_LONG
        ).show()
    }

    override fun onStop() {
        super.onStop()
        print("***App state:onStop***\n")
        Toast.makeText(
            applicationContext,"App state:onStop",Toast.LENGTH_LONG
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        print("***App state:onDestroy***\n")
        Toast.makeText(
            applicationContext,"App state:onDestroy",Toast.LENGTH_LONG
        ).show()
    }
}