package com.apex.codeassesment.di.modules


import com.apex.codeassesment.data.remote.retrofit.UserApiService
import com.apex.codeassesment.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit() : Retrofit{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesUserApiService(retrofit: Retrofit) : UserApiService{
        return retrofit.create(UserApiService::class.java)
    }
}