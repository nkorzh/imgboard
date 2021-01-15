
package com.nkorzh.imgboard

import java.time.LocalDateTime
import javax.annotation.processing.Generated
import javax.persistence.*

@Entity
@Table(name = "articles")
class Article(@Column(name = "title") var title: String,
              @Column(name = "content") var content: String,
              @Column(name = "author") var author: String,
              @Column(name = "date") var date: LocalDateTime = LocalDateTime.now(),
              @Id @Column(name = "id") @GeneratedValue var id: Long = 0)
