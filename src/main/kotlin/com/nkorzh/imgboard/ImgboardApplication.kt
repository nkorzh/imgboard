package com.nkorzh.imgboard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class ImgboardApplication

fun main(args: Array<String>) {
    runApplication<ImgboardApplication>(*args)
}
