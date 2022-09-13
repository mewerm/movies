package com.maximmesh.movies.data.models

import com.google.gson.annotations.SerializedName

data class Country(

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("timezone")
	val timezone: String,

	@field:SerializedName("name")
	val name: String
)