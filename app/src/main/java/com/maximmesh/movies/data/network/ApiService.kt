package com.maximmesh.movies.data.network

import com.maximmesh.movies.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/shows")
    suspend fun getAllMovies() : Response<List<Movies>>
}