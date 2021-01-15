//@file:Suppress("SpringJavaInjectionPointsAutowiringInspection")

package com.nkorzh.imgboard

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class BlogConfiguration {

//    @Bean
//    fun databaseInitializer(userRepository: UserRepository,
//                            articleRepository: ArticleRepository) = ApplicationRunner {
//
//        val nkorzh = userRepository.save(User("nkorzh", "Nikita", "Korzhikov"))
//        articleRepository.save(Article(
//                title = "Reactor Bismuth is out",
//                headline = "Lorem ipsum",
//                content = "dolor sit amet",
//                author = nkorzh
//        ))
//        articleRepository.save(Article(
//                title = "Reactor Aluminium has landed",
//                headline = "Lorem ipsum",
//                content = "dolor sit amet",
//                author = nkorzh
//        ))
//    }
}