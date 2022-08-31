package com.maximmesh.movies.data.models

import com.google.gson.annotations.SerializedName

data class Movies(

	@field:SerializedName("summary")
	val summary: String,

	@field:SerializedName("image")
	val image: Image,

	@field:SerializedName("averageRuntime")
	val averageRuntime: Int,

	@field:SerializedName("dvdCountry")
	val dvdCountry: Any,

	@field:SerializedName("_links")
	val links: Links,

	@field:SerializedName("premiered")
	val premiered: String,

	@field:SerializedName("rating")
	val rating: Rating,

	@field:SerializedName("runtime")
	val runtime: Int,

	@field:SerializedName("weight")
	val weight: Int,

	@field:SerializedName("language")
	val language: String,

	@field:SerializedName("type")
	val type: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("officialSite")
	val officialSite: String,

	@field:SerializedName("network")
	val network: Network,

	@field:SerializedName("schedule")
	val schedule: Schedule,

	@field:SerializedName("webChannel")
	val webChannel: Any,

	@field:SerializedName("genres")
	val genres: List<String>,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("ended")
	val ended: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("externals")
	val externals: Externals,

	@field:SerializedName("updated")
	val updated: Int,

	@field:SerializedName("status")
	val status: String
)