package com.example.myweatherapp.network

data class MainWeather (
    val temp: Double,
    val feels_like: Double,
    val temp_min:Double,
    val temp_max: Double,
    val pressure: Int
        )