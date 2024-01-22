package com.sparta.todo.domain.todo.dto

import java.time.LocalDateTime

data class UpdateToDoRequest(
    val title: String,
    val nickname: String,
    val contents: String,
    val createdAt: LocalDateTime = LocalDateTime.now()
)
