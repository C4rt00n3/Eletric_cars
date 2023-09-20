package com.example.eletriccarapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccarapp.R
import com.example.eletriccarapp.domains.DataCar

class CarAdapter(private val cars: Array<DataCar>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_car, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.value.text = cars[position].value
        holder.recharge.text = cars[position].recharge
        holder.battery.text = cars[position].battery
        holder.power.text = cars[position].power
    }

    override fun getItemCount(): Int = cars.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val value: TextView
        val recharge: TextView
        val power: TextView
        val battery: TextView

        init {
            value = view.findViewById(R.id.tv_value)
            recharge = view.findViewById(R.id.tv_value_recharge)
            battery = view.findViewById(R.id.tv_value_kw)
            power = view.findViewById(R.id.tv_power_value)
        }
    }

}