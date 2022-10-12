package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content

import com.google.gson.annotations.SerializedName
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.model.Confusion

data class ConfusionDto(
    val id: String,
    @SerializedName("dogru")
    val correct: String,
    @SerializedName("yanlis")
    val wrong: String
)

fun ConfusionDto.toConfusion(): Confusion {
    return Confusion(
        correct = correct,
        wrong = wrong
    )
}