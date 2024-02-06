package com.sparta.todo.domain.comments.service

import com.sparta.todo.domain.todo.model.ToDo
import jakarta.persistence.*

@Entity
@Table
class CommentsService(
    @Column(name = "nickname")
    val nickname: String,

    @Column(name = "comments")
    val comments: String,

    @OneToMany(mappedBy = "comments", fetch = FetchType.LAZY, cascade = [CascadeType.ALL], orphanRemoval = true)
    val todo: MutableList<ToDo> = mutableListOf()
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}
