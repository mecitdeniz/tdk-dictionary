package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content

import com.google.gson.annotations.SerializedName
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.model.Content

data class HomeContentDto(
    @SerializedName("atasoz")
    val proverbs: List<ProverbDto>,
    @SerializedName("karistirma")
    val confusions: List<ConfusionDto>,
    @SerializedName("kelime")
    val words: List<WordDto>,
    @SerializedName("kural")
    val rules: List<RuleDto>,
    @SerializedName("sayac")
    val counters: List<CounterDto>,
    val syyd: List<SyydDto>,
    @SerializedName("yabanci")
    val foreign: ForeignDto
)

fun HomeContentDto.toContent(): Content {
    return Content(
        proverbs = proverbs,
        confusions = confusions,
        words=words,
        rules = rules,
        counters = counters,
        syyd = syyd,
        foreign = foreign
    )
}