package com.instoredoes.weatherapp.data.network.response

import com.google.gson.annotations.SerializedName
import com.instoredoes.weatherapp.data.db.entity.CurrentWeatherEntry
import com.instoredoes.weatherapp.data.db.entity.Location


data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: Location
)