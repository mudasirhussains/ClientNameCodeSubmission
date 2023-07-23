package com.apex.codeassesment

import com.apex.codeassesment.data.model.InfoData
import com.apex.codeassesment.data.model.Name
import com.apex.codeassesment.data.model.RemoteData
import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.data.remote.DataResult
import com.apex.codeassesment.data.remote.RemoteDataSource
import com.apex.codeassesment.data.remote.retrofit.UserApiService
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import retrofit2.Response

@ExperimentalCoroutinesApi
class RemoteDataSourceTest {

    private val userApiService: UserApiService = mock()
    private val remoteDataSource = RemoteDataSource(userApiService)

    @Test
    fun `loadUser - Success`() = runBlocking {
        val remoteData = RemoteData(
            results = listOf(User(name = Name("John", "Doe"))),
            info = InfoData(seed = "seed", results = 1, page = 1, version = "version")
        )
        val response = Response.success(remoteData)
        whenever(userApiService.getRandomUser()).thenReturn(response)

        val result = remoteDataSource.loadUser()

        assertEquals(DataResult.Success(remoteData.results[0]), result)
    }

    @Test
    fun `loadUser - API Failure`() = runBlocking {
        val response = Response.error<RemoteData>(404, mock())
        whenever(userApiService.getRandomUser()).thenReturn(response)
        val result = remoteDataSource.loadUser()

        assertEquals(DataResult.Failure("Failed to fetch random user."), result)
    }

    @Test
    fun `loadUsersWithGivenCount - Success`() = runBlocking {
        val count = 5
        val remoteDataList = listOf(
            User(name = Name("John", "Doe")),
            User(name = Name("Jane", "Smith")),
            User(name = Name("Michael", "Johnson"))
        )
        val remoteData = RemoteData(
            results = remoteDataList,
            InfoData(seed = "seed", results = 1, page = 1, version = "version")
        )
        val response = Response.success(remoteData)
        whenever(userApiService.getRandomUsers(count)).thenReturn(response)

        val result = remoteDataSource.loadUsersWithGivenCount(count)

        assertEquals(DataResult.Success(remoteDataList), result)
    }

    @Test
    fun `loadUsersWithGivenCount - API Failure`() = runBlocking {
        val count = 5
        val response = Response.error<RemoteData>(404, mock())
        whenever(userApiService.getRandomUsers(count)).thenReturn(response)

        val result = remoteDataSource.loadUsersWithGivenCount(count)

        assertEquals(DataResult.Failure("Failed to fetch random users."), result)
    }

    @Test
    fun `loadUsersWithGivenCount - Network Exception`() = runBlocking {
        val count = 5
        val result = remoteDataSource.loadUsersWithGivenCount(count)
        assertTrue(result is DataResult.Failure)
    }

    @Test
    fun `loadUsersWithGivenCount - HTTP Exception`() = runBlocking {
        val count = 10
        val result = remoteDataSource.loadUsersWithGivenCount(count)
        assertTrue(result is DataResult.Failure)
    }


    @Test
    fun `loadUsersWithGivensCount - API Failure`() = runBlocking {
        val count = 5
        val response = Response.error<RemoteData>(404, mock())
        whenever(userApiService.getRandomUsers(count)).thenReturn(response)

        val result = remoteDataSource.loadUsersWithGivenCount(count)

        assertEquals(DataResult.Failure("Failed to fetch random users."), result)
    }

}
