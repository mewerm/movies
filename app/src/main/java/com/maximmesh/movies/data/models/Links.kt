package com.maximmesh.movies.data.models

import com.google.gson.annotations.SerializedName

data class Links(

	@field:SerializedName("self")
	val self: Self,

	@field:SerializedName("previousepisode")
	val previousepisode: Previousepisode
)