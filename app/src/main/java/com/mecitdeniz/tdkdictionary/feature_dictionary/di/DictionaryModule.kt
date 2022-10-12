package com.mecitdeniz.tdkdictionary.feature_dictionary.di

import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.DictionaryApi
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.repository.DictionaryRepository
import com.mecitdeniz.tdkdictionary.feature_dictionary.repository.DictionaryRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DictionaryModule {

    @Provides
    @Singleton
    fun provideDictionaryApi(): DictionaryApi {
        return Retrofit.Builder()
            .baseUrl(DictionaryApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DictionaryApi::class.java)
    }

    @Provides
    @Singleton
    fun provideDictionaryRepository(api: DictionaryApi): DictionaryRepository {
        return DictionaryRepositoryImpl(api)
    }
}