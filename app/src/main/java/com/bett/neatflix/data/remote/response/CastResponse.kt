package com.bett.neatflix.data.remote.response

import com.bett.neatflix.model.Cast
import com.google.gson.annotations.SerializedName

data class CastResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("cast")
    val castResult: List<Cast>
)
