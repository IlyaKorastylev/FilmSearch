package com.example.filmsearch

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IMDbApi {
    @GET("/en/API/SearchMovie/k_0vsjzpk0/{expression}")
    fun findMovie(@Path("expression") expression: String): Call<MoviesResponse>
}