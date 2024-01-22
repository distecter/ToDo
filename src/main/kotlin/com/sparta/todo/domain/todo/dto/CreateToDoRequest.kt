package com.sparta.todo.domain.todo.dto

data class DCreateToDoRequest(
    val title: String,
    val nickname: String,
    val contents: String
)
