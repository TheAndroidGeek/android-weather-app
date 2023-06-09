package com.androidgeek.weather.feature.weather.domain.weather.model

import java.time.LocalDateTime

data class WeatherData(
        val time: LocalDateTime,
        val temperatureCelsius: Double,
        val pressure: Double,
        val windSpeed: Double,
        val humidity: Double,
        val weatherType: WeatherType
)
