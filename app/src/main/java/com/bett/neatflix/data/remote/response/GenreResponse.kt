package com.bett.neatflix.data.remote.response

import com.bett.neatflix.model.Genre
import com.google.gson.annotations.SerializedName

data class GenreResponse(
    @SerializedName("genres")
    val genres: List<Genre>
)