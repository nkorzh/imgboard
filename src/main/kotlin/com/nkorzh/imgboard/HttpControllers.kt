package com.nkorzh.imgboard

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.persistence.Table

@RestController
@Table(name = "offrum_table")
@RequestMapping("/api/article")
class ArticleController @Autowired constructor(private val repository: ArticleRepository) {
}

