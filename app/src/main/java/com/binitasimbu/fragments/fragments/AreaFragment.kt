package com.binitasimbu.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.binitasimbu.fragments.R


class AreaFragment : Fragment() {
    private lateinit var etFirst: EditText
    private lateinit var btnCalculate: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_area, container, false)
        etFirst = view.findViewById(R.id.etFirst)
        btnCalculate = view.findViewById(R.id.btnCalculate)

        btnCalculate.setOnClickListener {
            areaOfCricle()

        }
        return view
    }
    private fun areaOfCricle(){
        val radius=etFirst.text.toString().toInt()

        val result= (3.14159 * radius *radius)
        Toast.makeText(context,"area is $result", Toast.LENGTH_SHORT).show()
    }
}


