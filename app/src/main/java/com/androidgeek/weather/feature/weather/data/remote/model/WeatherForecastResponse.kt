package com.androidgeek.weather.feature.weather.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherForecastResponse(
    @SerialName("hourly")
    val weatherForecastData: WeatherForecastDataDTO
)
