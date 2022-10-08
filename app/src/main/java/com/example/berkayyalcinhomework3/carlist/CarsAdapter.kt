package com.example.berkayyalcinhomework3.carlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.berkayyalcinhomework3.R
import com.example.berkayyalcinhomework3.data.CarModel

class CarsAdapter(private val carList: MutableList<CarModel>,private val listener: CarsListener) :
    RecyclerView.Adapter<CarsAdapter.CarsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_car_list, parent, false)
        return CarsViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        holder.bind(carList[position],listener)

    }

    override fun getItemCount(): Int {
        return carList.size
    }


    class CarsViewHolder(view: View) : RecyclerView.ViewHolder(view){

        //To create cars at RecyclerView We shoıld Create a bind Function

        private val tvId = view.findViewById<TextView>(R.id.tvId)
        private val tvCarName = view.findViewById<TextView>(R.id.tvCarName)
        private val tvCarBrand = view.findViewById<TextView>(R.id.tvCarBrand)
        private val tvCarPrice = view.findViewById<TextView>(R.id.tvCarPrice)

        fun bind(car : CarModel,listener: CarsListener){
            tvId.text = car.id
            tvCarName.text = car.carName
            tvCarBrand.text = car.carBrand
            tvCarPrice.text = car.price


            itemView.setOnClickListener {
                listener.onClicked(car)
            }

        }
    }
}
interface CarsListener {
    fun onClicked(car : CarModel)
}