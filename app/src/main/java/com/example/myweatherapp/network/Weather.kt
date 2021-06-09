package com.example.myweatherapp.network

data class Weather (
    val name: String,
    val wind: Wind,
    val main: MainWeather,
    val visibility: Int,
    val sys: Sys,
    val weather: List<WeatherWeathre>
        )

