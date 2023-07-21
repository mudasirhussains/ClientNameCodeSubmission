package com.apex.codeassesment.data.repository

import com.apex.codeassesment.data.local.LocalDataSource
import com.apex.codeassesment.data.model.RemoteData
import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.data.remote.DataResult
import com.apex.codeassesment.data.remote.RemoteDataSource
import java.util.concurrent.atomic.AtomicReference
import javax.inject.Inject

// TODO (2 points) : Add tests
// TODO (3 points) : Hide this class through an interface, inject the interface in the clients instead and remove warnings -done
class UserRepository @Inject constructor(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : IUserRepository {

    private val savedUser = AtomicReference(User())

    override fun getSavedUser() = localDataSource.loadUser()!!
    override suspend fun getUser(forceUpdate: Boolean): DataResult<User> {
        val cachedUser = localDataSource.loadUser()
        if (cachedUser != null) {
            // If data is cached, return the cached user immediately
            return DataResult.Success(cachedUser)
        }
        // If data is not cached or expired, fetch data from the remoteDataSource
        val remoteResult = remoteDataSource.loadUser()
        // Save the result to localDataSource (caching)
        if (remoteResult is DataResult.Success) {
            localDataSource.saveUser(remoteResult.data)
        }

        return remoteResult
    }

    override suspend fun getUsers(): DataResult<List<RemoteData>> {
        return remoteDataSource.loadUsersWithGivenCount(count = 10)
    }
}
