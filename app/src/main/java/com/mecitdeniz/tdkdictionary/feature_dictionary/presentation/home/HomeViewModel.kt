package com.mecitdeniz.tdkdictionary.feature_dictionary.presentation.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mecitdeniz.tdkdictionary.core.util.Resource
import com.mecitdeniz.tdkdictionary.feature_dictionary.domain.use_case.GetHomeContent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getHomeContent: GetHomeContent
) : ViewModel() {

    private val _state = mutableStateOf(HomeState())
    val state: State<HomeState> = _state


    init {
        getContent()
    }

    private fun getContent() {
        getHomeContent().onEach { result ->

            when (result) {
                is Resource.Success -> {
                    _state.value = HomeState(content = result.data ?: null)
                }

                is Resource.Error -> {
                    _state.value =
                        HomeState(error = result.message ?: "An unexpected error occurred!")
                }

                is Resource.Loading -> {
                    _state.value = HomeState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

}