package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content

import com.google.gson.annotations.SerializedName

data class ForeignDto(
    @SerializedName("anlam")
    val meaning: String,
    @SerializedName("karsid")
    val equivalentId: String,
    @SerializedName("kkarsilik")
    val equivalentForeignWord: String,
    @SerializedName("kkelime")
    val equivalentTurkishWord: String,
    @SerializedName("kkoken")
    val equivalentRoot: String
)