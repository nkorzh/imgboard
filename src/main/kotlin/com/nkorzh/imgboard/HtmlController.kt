package com.nkorzh.imgboard

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import javax.servlet.http.HttpServletRequest


@Controller
class HtmlController @Autowired constructor(private val repository: ArticleRepository, private val properties: BlogProperties) {


    @GetMapping("/")
    fun blog(model: Model,
             request: HttpServletRequest,
             @PageableDefault(sort = ["date"], direction = Sort.Direction.DESC) pageable: Pageable): String {

        val page = repository.findAll(pageable)
        model["title"] = properties.title
        model["footer"] = properties.footer
        // we can make some conditions for user warnings, though I decided to delete that
//        model["banner"] = properties.banner
        model["page"] = page
        model["url"] = "/"
        model["articles"] = page.map{ it.render() }.toList()
        println("refresh: ${request.requestURL}")
        return "blog"
    }

    @GetMapping("/newpost")
    fun renderNewpost(model: Model): String {
        println("Came to newpost")
        model["title"] = "Write new post"
        model["footer"] = properties.footer
        return "newpost"
    }

    // data classes for data transfer are magnificent!
    @PostMapping("/newpost")
    fun addArticle(@ModelAttribute article: Article, model: Model): String {

        if (article.content.isEmpty()) article.content = "Anonymous"
        repository.save(article)
        return "redirect:/"
    }

    @GetMapping("/article/{id}")
    fun showArticle(@PathVariable id: Long, model: Model): String {

        val article = repository.findById(id)?.get().render(true)
        // null check is unnecessary, though, user can type in nonexistent id,
        // thus potential error is prevented
        return if (article != null) {
            model["article"] = article
            model["title"] = "Offrum: " + article.title
            model["footer"] = properties.footer

            "article"
        } else
            "redirect:/"
    }

    data class RenderedArticle(
            val id: Long,
            val title: String,
            val content: String,
            val author: String,
            val date: String)
}


