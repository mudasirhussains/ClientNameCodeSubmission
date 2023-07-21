package com.apex.codeassesment.di.modules

import com.apex.codeassesment.data.repository.IUserRepository
import com.apex.codeassesment.data.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @Provides
    fun getUserRepository(userRepository: UserRepository) : IUserRepository {
        return userRepository
    }
}
