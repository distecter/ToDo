package com.sparta.todo.domain.todo.controller

import com.sparta.todo.domain.todo.dto.CreateToDoRequest
import com.sparta.todo.domain.todo.dto.ToDoResponse
import com.sparta.todo.domain.todo.dto.UpdateToDoRequest
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
class ToDoController {

    @GetMapping("/{ToDoId}")
    fun getTodo(@PathVariable ToDoId: Long) {
        TODO()
    }

    @PostMapping
    fun createToDo(@RequestBody createToDoRequest: CreateToDoRequest):
            ResponseEntity<ToDoResponse> {
        TODO()
    }

    @PutMapping("/{ToDoId}")
    fun updateToDo(@PathVariable ToDoId: Long, @RequestBody updateToDoRequest: UpdateToDoRequest){
        TODO()
    }

    @DeleteMapping("/{ToDoId}")
    fun deleteToDo(@PathVariable ToDoId: Long) {
        TODO()
    }
}