package com.maximmesh.movies.data.models

import com.google.gson.annotations.SerializedName

data class Network(

	@field:SerializedName("country")
	val country: Country,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("officialSite")
	val officialSite: String
)