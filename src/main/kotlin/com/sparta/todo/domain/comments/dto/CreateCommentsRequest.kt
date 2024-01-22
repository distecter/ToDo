package com.sparta.todo.domain.comments.dto

data class CreateCommentsRequest(
    val nickname: String,
    val contents: String
)
