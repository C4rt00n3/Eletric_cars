package com.example.eletriccarapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccarapp.R
import com.example.eletriccarapp.data.cars
import com.example.eletriccarapp.ui.adapters.CarAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CarFragment : Fragment() {
    lateinit var button: FloatingActionButton
    lateinit var list: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.car_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setView(view)
        setItenList()
        actionListners()

    }

    fun setView(view: View) {
        button = view.findViewById<FloatingActionButton>(R.id.fl_button)
        list = view.findViewById<RecyclerView>(R.id.rv_listcar)
    }

    fun actionListners(){
        val intent = Intent(context, CalcAutonomyActivity::class.java)

        button.setOnClickListener {
            startActivity(intent)
        }
    }


    fun setItenList() {
        val adapter = CarAdapter(cars)
        list.adapter = adapter
    }

}