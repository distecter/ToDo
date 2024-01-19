package com.sparta.todo.domain.todo.dto

import java.time.LocalDateTime


data class TodoResponse(
    val title: String,
    val maintext: String,
    val createdAt: LocalDateTime = LocalDateTime.now()
    val coments: String,
    val nickname: String
)
