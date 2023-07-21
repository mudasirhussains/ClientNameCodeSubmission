package com.apex.codeassesment.data.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.apex.codeassesment.data.model.RemoteData
import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.data.remote.DataResult
import com.apex.codeassesment.data.repository.IUserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


class MainActivityViewModel @Inject constructor(private val userRepository: IUserRepository) :
    ViewModel() {

    private val _randomUser = MutableLiveData<User?>()
    val randomUser: MutableLiveData<User?> get() = _randomUser

    private val _usersList = MutableLiveData<List<RemoteData>?>()
    val usersList: MutableLiveData<List<RemoteData>?> get() = _usersList

    init {
        _randomUser.value = userRepository.getSavedUser()
    }

    fun refreshRandomUser() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val result = userRepository.getUser(true)
                withContext(Dispatchers.Main) {
                    when (result) {
                        is DataResult.Success -> {
                            _randomUser.value = result.data
                        }

                        is DataResult.Failure -> {
                            // Handle error, if needed
                            Log.e(
                                "MainActivityViewModel",
                                "Error fetching random user: ${result.error}"
                            )
                        }
                    }
                }
            } catch (e: Exception) {
                Log.e("MainActivityViewModel", "Error fetching random user: $e")
            }
        }
    }

    fun loadUsersList() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val result = userRepository.getUsers()
                withContext(Dispatchers.Main) {
                    when (result) {
                        is DataResult.Success -> {
                            _usersList.value = result.data
                        }

                        is DataResult.Failure -> {
                            // Handle error, if needed
                            Log.e(
                                "MainActivityViewModel",
                                "Error fetching random users: ${result.error}"
                            )
                        }
                    }
                }
            } catch (e: Exception) {
                Log.e("MainActivityViewModel", "Error fetching random users: $e")
            }
        }
    }

}