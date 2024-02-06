package com.sparta.todo.domain.todo.dto

data class CreateToDoRequest(
    val title: String,
    val nickname: String,
    val contents: String
)
