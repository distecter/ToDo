package com.sparta.todo.domain.comments.dto

data class CommentsResponse(
    val id: Long,
    val nickname: String,
    val contents: String
)
