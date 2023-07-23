package com.apex.codeassesment.data.repository

import com.apex.codeassesment.data.local.LocalDataSource
import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.data.remote.DataResult
import com.apex.codeassesment.data.remote.RemoteDataSource
import javax.inject.Inject

// TODO (2 points) : Add tests - done
// TODO (3 points) : Hide this class through an interface, inject the interface in the clients instead and remove warnings -done
class UserRepository @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : IUserRepository {

    override fun getSavedUser() = localDataSource.loadUser()
    override suspend fun getUser(forceUpdate: Boolean): DataResult<User> {
        val remoteResult = remoteDataSource.loadUser()
        if (forceUpdate){
            if (remoteResult is DataResult.Success) {
                localDataSource.saveUser(remoteResult.data)
            }
        }
        return remoteResult
    }

    override suspend fun getUsersList(): DataResult<List<User>> {
        return remoteDataSource.loadUsersWithGivenCount(count = 10)
    }
}
