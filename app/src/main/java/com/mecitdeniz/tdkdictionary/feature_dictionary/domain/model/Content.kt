package com.mecitdeniz.tdkdictionary.feature_dictionary.domain.model

import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content.*

data class Content(
    val proverbs: List<ProverbDto>,
    val confusions: List<ConfusionDto>,
    val words: List<WordDto>,
    val rules: List<RuleDto>,
    val counters: List<CounterDto>,
    val syyd: List<MistakeDto>,
    val foreign: ForeignDto
)
