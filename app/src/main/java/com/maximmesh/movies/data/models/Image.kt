package com.maximmesh.movies.data.models

import com.google.gson.annotations.SerializedName

data class Image(

	@field:SerializedName("original")
	val original: String,

	@field:SerializedName("medium")
	val medium: String
)