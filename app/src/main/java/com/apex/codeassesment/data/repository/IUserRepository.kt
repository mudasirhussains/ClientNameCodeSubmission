package com.apex.codeassesment.data.repository

import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.data.remote.DataResult

interface IUserRepository {
    fun getSavedUser(): User
    suspend fun getUser(forceUpdate: Boolean): DataResult<User>
    suspend fun getUsersList(): DataResult<List<User>>
}