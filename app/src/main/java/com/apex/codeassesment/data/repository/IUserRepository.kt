package com.apex.codeassesment.data.repository

import com.apex.codeassesment.data.model.RemoteData
import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.data.remote.DataResult

interface IUserRepository {
    fun getSavedUser(): User
    suspend fun getUser(forceUpdate: Boolean): DataResult<User>
    suspend fun getUsers(): DataResult<List<RemoteData>>
}