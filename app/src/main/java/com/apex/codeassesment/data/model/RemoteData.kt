package com.apex.codeassesment.data.model

data class RemoteData(
    val results: List<User>,
    val info: InfoData
)

data class InfoData(
    val seed: String,
    val results: Int,
    val page: Int,
    val version: String,
)