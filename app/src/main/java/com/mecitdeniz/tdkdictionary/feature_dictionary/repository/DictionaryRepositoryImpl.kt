package com.mecitdeniz.tdkdictionary.feature_dictionary.repository

import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.DictionaryApi
import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content.HomeContentDto
import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.word.WordInfoDto
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.repository.DictionaryRepository


class DictionaryRepositoryImpl (
    private val api: DictionaryApi,
    ): DictionaryRepository {

    override suspend fun getWordInfo(word: String): WordInfoDto {
        TODO("Not yet implemented")
    }

    override suspend fun getHomeContent(): HomeContentDto {
        return api.getHomeContent()
    }

}