package com.apex.codeassesment.data.remote

import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.data.remote.retrofit.UserApiService
import com.bumptech.glide.load.HttpException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException
import javax.inject.Inject

// TODO (2 points): Add tests -done
class RemoteDataSource @Inject constructor(private val userApiService: UserApiService) {

  // TODO (5 points): Load data from endpoint https://randomuser.me/api -done
  suspend fun loadUser(): DataResult<User> {
    return try {
      val response = userApiService.getRandomUser()
      if (response.isSuccessful && response.body() != null) {
        DataResult.Success(response.body()!!.results[0])
      } else {
        DataResult.Failure("Failed to fetch random user.")
      }
    } catch (e: Exception) {
      DataResult.Failure("Error occurred while fetching random user: ${e.message}")
    }
  }

  // TODO (3 points): Load data from endpoint https://randomuser.me/api?results=10 -done
  // TODO (Optional Bonus: 3 points): Handle succes and failure from endpoints -done

  suspend fun loadUsersWithGivenCount(count: Int): DataResult<List<User>> {
    return withContext(Dispatchers.IO) {
      try {
        val response = userApiService.getRandomUsers(count)
        if (response.isSuccessful) {
          val remoteDataList = response.body()?.results
          if (remoteDataList != null) {
            DataResult.Success(remoteDataList) // Return the extracted list as Success
          } else {
            DataResult.Failure("Failed to fetch random users.")
          }
        } else {
          DataResult.Failure("Failed to fetch random users.")
        }
      } catch (e: IOException) {
        DataResult.Failure("Network error occurred while fetching random users: ${e.message}")
      } catch (e: HttpException) {
        DataResult.Failure("HTTP error occurred while fetching random users: ${e.message}")
      } catch (e: Exception) {
        DataResult.Failure("Error occurred while fetching random users: ${e.message}")
      }
    }
  }

//  old data:
//  fun LoadUser() = User.createRandom()
//  fun loadUsers() = (0..10).map { User.createRandom() }
}
