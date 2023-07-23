package com.apex.codeassesment.data.remote.retrofit

import com.apex.codeassesment.data.model.RemoteData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApiService {

    @GET("api")
    suspend fun getRandomUser(): Response<RemoteData>

    @GET("api")
    suspend fun getRandomUsers(@Query("results") count: Int): Response<RemoteData>
}