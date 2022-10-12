package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content

import com.google.gson.annotations.SerializedName

data class ConfusionDto(
    val id: String,
    @SerializedName("dogru")
    val correct: String,
    @SerializedName("yanlis")
    val wrong: String
)