package com.sparta.todo.domain.todo.controller

import com.sparta.todo.domain.todo.dto.CreateToDoRequest
import com.sparta.todo.domain.todo.dto.ToDoResponse
import com.sparta.todo.domain.todo.dto.UpdateToDoRequest
import com.sparta.todo.domain.todo.service.ToDoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ToDo")
class ToDoController(private val toDoService: ToDoService) {

    @GetMapping("/{todoId}")
    fun getTodo(@PathVariable todoId: Long): ResponseEntity<ToDoResponse> {
        val toDoResponse = toDoService.getToDoById(todoId)
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(toDoResponse)
    }

    @PostMapping
    fun createToDo(@RequestBody createToDoRequest: CreateToDoRequest
    ): ResponseEntity<ToDoResponse> {
        val createdToDo = toDoService.createToDo(createToDoRequest)
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(createdToDo)
    }

    @PutMapping("/{todoId}")
    fun updateToDo(@PathVariable todoId: Long, @RequestBody updateToDoRequest: UpdateToDoRequest
    ): ResponseEntity<Unit> {
        toDoService.updateToDo(todoId, updateToDoRequest)
        return ResponseEntity.status(HttpStatus.OK).build()
    }

    @DeleteMapping("/{todoId}")
    fun deleteToDo(@PathVariable todoId: Long): ResponseEntity<Unit> {
        toDoService.deleteToDo(todoId)
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build()
    }
}