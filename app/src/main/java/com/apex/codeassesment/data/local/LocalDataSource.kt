package com.apex.codeassesment.data.local

import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.data.model.User.Companion.createRandom
import com.squareup.moshi.Moshi
import javax.inject.Inject

// TODO (3 points): Convert to Kotlin - done
// TODO (2 point): Add tests
// TODO (1 point): Use the correct naming conventions. -done
// TODO (3 points): Inject all dependencies instead of instantiating them. -done
class LocalDataSource @Inject constructor() {
    private var preferencesManager: PreferencesManager? = null
    private val moshi = Moshi.Builder().build()


    @Inject
    fun localDataSource(preferencesManager: PreferencesManager?) {
        this.preferencesManager = preferencesManager
    }

    fun loadUser(): User {
        val serializedUser = preferencesManager!!.loadUser()
        val jsonAdapter = moshi.adapter(
            User::class.java
        )
        return try {
            // TODO (1 point): Address Android Studio warning
            val user = serializedUser?.let { jsonAdapter.fromJson(it) }
            user ?: createRandom()
        } catch (e: Exception) {
            e.printStackTrace()
            createRandom()
        }
    }

    fun saveUser(user: User) {
        val jsonAdapter = moshi.adapter(
            User::class.java
        )
        val serializedUser = jsonAdapter.toJson(user)
        preferencesManager!!.saveUser(serializedUser)
    }
}