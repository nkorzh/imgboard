//@file:Suppress("ConfigurationProperties")

package com.nkorzh.imgboard

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("blog")
data class BlogProperties(var title: String, val banner: Banner, val footer: Footer) {
    data class Banner(val title: String? = null, val content: String)
    data class Footer(val tools: String = "Powered by Spring & Kotlin", val text: String? = null)
}