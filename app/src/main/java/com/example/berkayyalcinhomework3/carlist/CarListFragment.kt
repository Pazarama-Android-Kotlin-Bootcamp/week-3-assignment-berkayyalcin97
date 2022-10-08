package com.example.berkayyalcinhomework3.carlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.berkayyalcinhomework3.R
import com.example.berkayyalcinhomework3.data.CarModel
import com.example.berkayyalcinhomework3.data.mockCarData
//İn this Class my Data is Listed by called adapter
class CarListFragment : Fragment(),CarsListener {

    private lateinit var rvCarList: RecyclerView
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_car_list, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        rvCarList = view.findViewById(R.id.rvCarList)
        setupAdapter()
    }

    private fun setupAdapter() {
        rvCarList.adapter = CarsAdapter(mockCarData,this@CarListFragment)

    }

    override fun onClicked(car: CarModel) {

        navController.navigate(R.id.action_carListFragment_to_carDetailFragment, Bundle().apply {
            putString("carModel", car.toJson())
        })
    }


}