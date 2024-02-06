package com.sparta.todo.domain.todo.service

import com.sparta.todo.domain.comments.repository.CommentsRepository
import com.sparta.todo.domain.todo.dto.CreateToDoRequest
import com.sparta.todo.domain.todo.dto.ToDoResponse
import com.sparta.todo.domain.todo.dto.UpdateToDoRequest
import com.sparta.todo.domain.todo.repository.ToDoRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class ToDoServiceImpl(
    private val todoRepository: ToDoRepository,
) : ToDoService {
    override fun getAllToDoList(): List<ToDoResponse> {
        return todoRepository.findAll().map { it.toResponse() }
    }

    override fun getToDoById(todoId: Long): ToDoResponse {
        val todo = todoRepository.findByIdOrNull(todoId) ?: throw ModelNotFoundException("Todo", todoId)
        return todo.toResponse()
    }

    @Transactional
    override fun createToDo(request: CreateToDoRequest): ToDoResponse {
        return todoRepository.save(
            Todo(
                nickname = request.nickname
                title = request.title,
                contents = request.contents
            )
        ).toResponse()
    }

    @Transactional
    override fun deleteToDo(todoId: Long) {
        val todo = todoRepository.findByIdOrNull(todoId) ?: throw ModelNotFoundException("Todo", todoId)
        todoRepository.delate(todo)
    }

    @Transactional
    override fun updateToDo(todoId: Long, request: UpdateToDoRequest): ToDoResponse {
        val todo = todoRepository.findByIdOrNull(todoId) ?: throw ModelNotFoundException("Todo", todoId)
        val (title, contents, nickname) = request

        todo.title = title
        todo.contents = contents
        todo.nickname = nickname

        return todoRepository.save(todo).toResponse()
    }
}