package com.example.berkayyalcinhomework3.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.berkayyalcinhomework3.R
import com.example.berkayyalcinhomework3.data.CarModel

class CarDetailFragment : Fragment() {
    private lateinit var tvCarName: TextView
    private lateinit var tvBrand: TextView
    private lateinit var tvDesc: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_car_detail, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
setupViews(view)
    }

    private fun setupViews(view: View) {
        tvCarName = view.findViewById(R.id.tvCarName)
        tvBrand = view.findViewById(R.id.tvBrand)
        tvDesc = view.findViewById(R.id.tvDescription)

        arguments?.let {
            val carData = it.getString("carModel")

            carData?.let { safeCarData ->
                val car = CarModel.fromJson(safeCarData)

                tvCarName.text = car.carName
                tvBrand.text = car.carBrand
                tvDesc.text = car.description

            }
        }
    }

}