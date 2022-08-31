package com.maximmesh.movies.data.models

import com.google.gson.annotations.SerializedName

data class Externals(

	@field:SerializedName("thetvdb")
	val thetvdb: Int,

	@field:SerializedName("imdb")
	val imdb: String,

	@field:SerializedName("tvrage")
	val tvrage: Int
)