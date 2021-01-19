package com.nkorzh.imgboard

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "articles")
data class Article(@Column(name = "title") var title: String,
                   @Column(name = "content") var content: String,
                   @Column(name = "author") var author: String,
                   @Column(name = "date") var date: LocalDateTime = LocalDateTime.now(),
                   @Id @Column(name = "id") @GeneratedValue var id: Long = 0)

