package com.apex.codeassesment

import com.apex.codeassesment.data.local.LocalDataSource
import com.apex.codeassesment.data.model.Name
import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.data.remote.DataResult
import com.apex.codeassesment.data.remote.RemoteDataSource
import com.apex.codeassesment.data.repository.UserRepository
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.never
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class UserRepositoryTest {

    @Mock
    private lateinit var localDataSource: LocalDataSource

    @Mock
    private lateinit var remoteDataSource: RemoteDataSource

    private lateinit var userRepository: UserRepository

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        userRepository = UserRepository(localDataSource, remoteDataSource)
    }

    @Test
    fun `test getSavedUser returns user from local data source`() {
        val user = User("John Doe", Name("title", "first", "last"))
        `when`(localDataSource.loadUser()).thenReturn(user)
        val savedUser = userRepository.getSavedUser()
        assert(savedUser == user)
    }

    @Test
    fun `test getUser with forceUpdate=true saves user to local data source and returns remote user`() = runBlocking {
        val user = User("Jane Smith", Name("title", "first", "last"))
        `when`(remoteDataSource.loadUser()).thenReturn(DataResult.Success(user))
        val result = userRepository.getUser(forceUpdate = true)
        verify(localDataSource).saveUser(user)
        assert(result is DataResult.Success)
        assert((result as DataResult.Success).data == user)
    }

    @Test
    fun `test getUser with forceUpdate=true returns error when remote data source fails`() = runBlocking {
        `when`(remoteDataSource.loadUser()).thenReturn(DataResult.Failure("Error"))

        val result = userRepository.getUser(forceUpdate = true)

        verify(localDataSource, never()).saveUser(Mockito.any())

        assert(result is DataResult.Failure)
        assert((result as DataResult.Failure).error == "Error")
    }

    @Test
    fun `test getUsersList returns list of users from remote data source`() = runBlocking {
        val userList = listOf(
            User("User1", Name("title", "first", "last")),
            User("User2", Name("title", "first", "last"))
        )
        `when`(remoteDataSource.loadUsersWithGivenCount(count = 10)).thenReturn(DataResult.Success(userList))

        val result = userRepository.getUsersList()
        assert(result is DataResult.Success)
        assert((result as DataResult.Success).data == userList)
    }
}
