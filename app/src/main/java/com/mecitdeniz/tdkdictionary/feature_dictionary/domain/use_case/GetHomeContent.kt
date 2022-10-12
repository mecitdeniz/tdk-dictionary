package com.mecitdeniz.tdkdictionary.feature_dictionary.domain.use_case

import com.mecitdeniz.tdkdictionary.core.util.Resource
import com.mecitdeniz.tdkdictionary.feature_dictionary.data.remote.dto.content.toContent
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.model.Content
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.repository.DictionaryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetHomeContent @Inject constructor(
    private val repository: DictionaryRepository
) {

    operator fun invoke(): Flow<Resource<Content>> = flow {
        try {
            emit(Resource.Loading<Content>())
            val content = repository.getHomeContent().toContent()

            emit(Resource.Success<Content>(content))
        } catch (e: HttpException) {
            emit(Resource.Error<Content>(message = e.localizedMessage.toString() ?: "An unexpected error occurred!"))
        } catch (e: IOException) {
            emit(Resource.Error<Content>(message = "Couldn't reach server please check your network connection"))
        }

    }
}