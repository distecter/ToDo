package com.sparta.todo.domain.todo.dto

import java.time.LocalDateTime

data class UpdateToDoResponse(
    val id: Long,
    val contents: String,
    val createdAt: LocalDateTime = LocalDateTime.now()
)
