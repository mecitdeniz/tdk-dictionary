package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content

import com.google.gson.annotations.SerializedName

data class CounterDto(
    @SerializedName("deger")
    val value: String
)