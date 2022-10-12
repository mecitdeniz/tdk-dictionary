package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content

import com.google.gson.annotations.SerializedName

data class SyydDto(
    val id: String,
    @SerializedName("dogrukelime")
    val correctWord: String,
    @SerializedName("yanliskelime")
    val wrongWord: String
)