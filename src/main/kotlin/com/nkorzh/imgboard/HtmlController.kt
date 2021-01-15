//@file:Suppress("SpringJavaInjectionPointsAutowiringInspection")
package com.nkorzh.imgboard

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException


@Controller
class HtmlController @Autowired constructor(private val repository: ArticleRepository, private val properties: BlogProperties) {



    @RequestMapping("/", method = [RequestMethod.GET])
    fun blog(model: Model): String {
        model["title"] = properties.title
        model["banner"] = properties.banner // 
        model["footer"] = properties.footer
        model["articles"] = repository.findAll().asReversed().map { it.render() }
        println("refresh\n")

        return "blog"
    }

    @RequestMapping("/", method = [RequestMethod.POST])
    fun addArticle(@RequestParam title: String,
                   @RequestParam content: String,
                   @RequestParam author: String,
                   model: Model): String {

        println("got request\n")
        val article = Article(title,
                              content,
                              if (author.isEmpty()) "Anonymous" else author)
        repository.save(article)

        return blog(model)
    }

    @GetMapping("/article/{id}")
    fun showArticle(@PathVariable id: Long, model: Model): String {
        model["title"] = properties.title
        model["footer"] = properties.footer
        val article = repository.findById(id)?.get().render(true)
        
        return if (article != null) {
            model["article"] = article
            "article"
        } else
            blog(model)
    }

    data class RenderedArticle(
            val id: Long,
            val title: String,
            val content: String,
            val author: String,
            val date: String)
}


