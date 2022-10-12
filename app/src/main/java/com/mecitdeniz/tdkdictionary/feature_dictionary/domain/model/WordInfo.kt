package com.mecitdeniz.tdkdictionary.feature_dictionary.domain.model

import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.word.MeaningDto

data class WordInfo(
    val meaningCount: String,
    val meanings: List<MeaningDto>,
    val combined: Any,
    val kind: String,
    val kindCount: String,
    val isPlural: String,
    val wordNo: String,
    val word: String,
    val wordPlain: String,
    val wordId: String,
    val prefix: Any,
    val isSpecial: String,
    val suffix: Any,
)
