package com.sparta.todo.domain.todo.dto

import java.time.LocalDateTime


data class ToDoResponse(
    val contents: String,
    val createAt: LocalDateTime = LocalDateTime.now(),
    val nickname: String,
    val id: Long
)
