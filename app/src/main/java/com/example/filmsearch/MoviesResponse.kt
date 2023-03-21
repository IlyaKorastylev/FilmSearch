package com.example.filmsearch

class MoviesResponse(val searchType: String,
                     val expression: String,
                     val results: List<Movie>)