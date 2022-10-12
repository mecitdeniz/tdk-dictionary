package com.mecitdeniz.tdkdictionary.feature_dictionary.presentation.home

import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.model.Content

data class HomeState(
    val isLoading: Boolean = false,
    val content: Content? = null,
    val error: String = ""
)
