package com.maximmesh.movies.data.network

import com.maximmesh.movies.data.models.Movies
import retrofit2.Response

interface ApiService {
    suspend fun getAllMovies() : Response<List<Movies>>
}