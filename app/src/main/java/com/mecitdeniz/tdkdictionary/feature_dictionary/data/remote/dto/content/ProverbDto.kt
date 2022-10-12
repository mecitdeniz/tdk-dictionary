package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content

import com.google.gson.annotations.SerializedName

data class ProverbDto(
    @SerializedName("anlam")
    val meaning: String,
    @SerializedName("madde")
    val proverb: String
)