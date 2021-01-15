package com.nkorzh.imgboard

import org.springframework.data.repository.CrudRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.persistence.Id

@Repository
interface ArticleRepository : JpaRepository<Article, Long> {

//    fun findById(id: Id): Article?
//    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}
