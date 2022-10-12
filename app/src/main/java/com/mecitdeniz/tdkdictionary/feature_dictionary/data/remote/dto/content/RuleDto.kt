package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content

import com.google.gson.annotations.SerializedName

data class RuleDto(
    @SerializedName("adi")
    val name: String,
    val url: String
)