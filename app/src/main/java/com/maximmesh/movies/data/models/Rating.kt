package com.maximmesh.movies.data.models

import com.google.gson.annotations.SerializedName

data class Rating(

	@field:SerializedName("average")
	val average: Double
)