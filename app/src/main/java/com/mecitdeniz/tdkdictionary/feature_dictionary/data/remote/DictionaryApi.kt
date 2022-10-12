package com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote

import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content.HomeContentDto
import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.word.WordInfoDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("/icerik")
    suspend fun getHomeContent(): HomeContentDto

    @GET("/gts?ara={word}")
    suspend fun getWordInfo(@Path("word") word: String): List<WordInfoDto>

    companion object {
        const val BASE_URL = "https://sozluk.gov.tr/"
    }

}