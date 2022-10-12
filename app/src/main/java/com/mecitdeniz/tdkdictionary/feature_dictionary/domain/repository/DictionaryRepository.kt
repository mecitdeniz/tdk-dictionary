package com.mecitdeniz.tdkdictionary.feature_dictionary.domain.repository

import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content.HomeContentDto
import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.word.WordInfoDto

interface DictionaryRepository {

    suspend fun getWordInfo(word:String): WordInfoDto

    suspend fun getHomeContent(): HomeContentDto
}