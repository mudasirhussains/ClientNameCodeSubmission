package com.apex.codeassesment.data.remote

sealed class DataResult<out T> {
    data class Success<out T>(val data: T) : DataResult<T>()
    data class Failure(val error: String) : DataResult<Nothing>()
}
