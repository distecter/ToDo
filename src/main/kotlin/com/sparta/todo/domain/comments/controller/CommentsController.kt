package com.sparta.todo.domain.comments.controller

import com.sparta.todo.domain.comments.dto.UpdateCommentsRequest
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/comments")
class CommentsController {
    @PutMapping("/{commentsId}")
    fun updateComments(@PathVariable CommentsId: Long, @RequestBody updateCommentsRequest: UpdateCommentsRequest) {
        TODO()
    }
}