package com.sparta.todo.domain.todo.dto

data class CreateTodoRequest(
    val title: String,
    val nickname: String,
    val contents: String
)
