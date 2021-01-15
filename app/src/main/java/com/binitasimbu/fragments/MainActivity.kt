package com.binitasimbu.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.binitasimbu.fragments.fragments.AreaFragment
import com.binitasimbu.fragments.fragments.SumFragment

class MainActivity : AppCompatActivity() {
    private lateinit var btnSum: Button
    private lateinit var btnArea: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSum=findViewById(R.id.btnSum)
        btnArea=findViewById(R.id.btnArea)

        btnSum.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearContainer, SumFragment())
                addToBackStack(null)
                commit()
            }
        }

        btnArea.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.linearContainer, AreaFragment())
                addToBackStack(null)
                commit()
            }
        }
    }
}