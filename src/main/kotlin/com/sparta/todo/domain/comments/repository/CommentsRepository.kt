package com.sparta.todo.domain.comments.repository

import com.sparta.todo.domain.todo.model.ToDo
import org.springframework.data.jpa.repository.JpaRepository

interface CommentsRepository: JpaRepository<ToDo, Long> {
}