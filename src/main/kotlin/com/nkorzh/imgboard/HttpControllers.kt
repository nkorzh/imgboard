//@file:Suppress("SpringJavaInjectionPointsAutowiringInspection")

package com.nkorzh.imgboard

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@RestController
//@Table(name = "articles")
@RequestMapping("/api/article")
class ArticleController @Autowired constructor(private val repository: ArticleRepository) {
}

