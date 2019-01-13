package com.example.owner.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val humanA = Human("A", 20,"android")
        humanA.say()

        val humanB = Human("B", 30,"kotlin")
        humanB.think()
    }
}
