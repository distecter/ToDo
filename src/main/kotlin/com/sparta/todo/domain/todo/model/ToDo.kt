package com.sparta.todo.domain.todo.model

import com.sparta.todo.domain.todo.dto.ToDoResponse
import jakarta.persistence.*
import org.hibernate.annotations.Comments

@Entity
@Table(name = "todo")
class ToDo(
    @Column(name = "nickname", nullable = false)
    var nickname: String,

    @Column(name = "title", nullable = false)
    var title: String,

    @Column(name = "contents", nullable = false)
    var contents: String,

    @ManyToOne
    val commnets: Comments
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}

fun ToDo.toResponse(): ToDoResponse {
    return  ToDoResponse(
        id = id!!,
        nickname = nickname,

    )
}