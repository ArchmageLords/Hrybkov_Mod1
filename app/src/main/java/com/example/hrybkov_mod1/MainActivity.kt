package com.example.hrybkov_mod1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import com.example.hrybkov_mod1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setData()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setData() {
        val livingRoom = ListItem(
            "Living Room",
            getString(R.string.device_amount),
            R.drawable.ic_chair_white_36dp
        )
        val kitchen = ListItem(
            "Kitchen",
            getString(R.string.device_amount),
            R.drawable.ic_countertops_white_36dp
        )
        val bathroom = ListItem(
            "Bathroom",
            getString(R.string.device_amount),
            R.drawable.ic_bathtub_white_36dp
        )
        val bedroom = ListItem(
            "Bedroom",
            getString(R.string.device_amount),
            R.drawable.ic_bed_white_36dp
        )
        val garage = ListItem(
            "Garage",
            getString(R.string.device_amount),
            R.drawable.ic_garage_white_36dp
        )
        val office = ListItem(
            "Office",
            getString(R.string.device_amount),
            R.drawable.ic_apartment_white_36dp
        )
        val kidsRoom = ListItem(
            "Kids Room",
            getString(R.string.device_amount),
            R.drawable.ic_child_friendly_white_36dp
        )
        val tvRoom = ListItem(
            "TV Room",
            getString(R.string.device_amount),
            R.drawable.ic_desktop_windows_white_36dp
        )
        val list = listOf(
            livingRoom,
            kitchen,
            bathroom,
            bedroom,
            garage,
            office,
            kidsRoom,
            tvRoom
        )

        val gridAdapter = GridAdapter(this, list)
        binding.elementsGrid.adapter = gridAdapter
    }
}