package com.sparta.todo.domain.comments.dto

data class UpdateCommentsRequest(
    val comments: String,
    val nickname: String
)
