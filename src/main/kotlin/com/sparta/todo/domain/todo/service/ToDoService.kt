package com.sparta.todo.domain.todo.service

import com.sparta.todo.domain.todo.dto.CreateToDoRequest
import com.sparta.todo.domain.todo.dto.ToDoResponse
import com.sparta.todo.domain.todo.dto.UpdateToDoRequest

interface ToDoService {
    fun getAllToDoList(): List<ToDoResponse>

    fun getToDoById(todoId: Long): ToDoResponse

    fun createToDo(request: CreateToDoRequest): ToDoResponse

    fun updateToDo(todoId: Long, request: UpdateToDoRequest): ToDoResponse

    fun deleteToDo(todoId: Long)

}
