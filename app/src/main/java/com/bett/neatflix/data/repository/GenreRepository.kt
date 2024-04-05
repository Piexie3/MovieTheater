package com.bett.neatflix.data.repository

import com.bett.neatflix.data.remote.response.GenreResponse
import com.bett.neatflix.data.remote.ApiService
import com.bett.neatflix.util.FilmType
import com.bett.neatflix.util.Resource
import java.lang.Exception
import javax.inject.Inject

class GenreRepository @Inject constructor(private val api: ApiService) {
    suspend fun getMoviesGenre(filmType: FilmType): Resource<GenreResponse>{
        val response = try {
            if (filmType == FilmType.MOVIE) api.getMovieGenres() else api.getTvShowGenres()
        } catch (e: Exception){
            return Resource.Error("Unknown error occurred!")
        }
        return Resource.Success(response)
    }
}