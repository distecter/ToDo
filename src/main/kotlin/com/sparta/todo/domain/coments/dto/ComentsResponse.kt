package com.sparta.todo.domain.coments.dto

import java.time.LocalDateTime

data class ComentsResponse(
    val coments: String,
    val createdAt: LocalDateTime = LocalDateTime.now()
    val nickname: String
)
