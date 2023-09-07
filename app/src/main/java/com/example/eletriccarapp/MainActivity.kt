package com.example.eletriccarapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccarapp.adapters.CarAdapter
import com.example.eletriccarapp.data.cars

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        moveActivity()
        setItenList()
    }

    fun moveActivity() {
        val button = findViewById<Button>(R.id.move_activity)
        val intent = Intent(this, CalcAutonomyActivity::class.java)

        button.setOnClickListener {
            startActivity(intent)
        }
    }

    fun setItenList() {
        val list = findViewById<RecyclerView>(R.id.rv_listcar)
        val adapter = CarAdapter(cars)
        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(this)
    }
}