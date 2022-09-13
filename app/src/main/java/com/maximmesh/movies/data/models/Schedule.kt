package com.maximmesh.movies.data.models

import com.google.gson.annotations.SerializedName

data class Schedule(

	@field:SerializedName("days")
	val days: List<String>,

	@field:SerializedName("time")
	val time: String
)