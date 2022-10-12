package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content

import com.google.gson.annotations.SerializedName
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.model.Mistake

data class MistakeDto(
    val id: String,
    @SerializedName("dogrukelime")
    val correctWord: String,
    @SerializedName("yanliskelime")
    val wrongWord: String
)

fun MistakeDto.toMistake(): Mistake {
    return Mistake(
        correctWord = correctWord,
        wrongWord = wrongWord
    )
}