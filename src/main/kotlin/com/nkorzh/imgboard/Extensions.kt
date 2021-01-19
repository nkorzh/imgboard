package com.nkorzh.imgboard

import java.time.LocalDateTime
import java.time.format.DateTimeFormatterBuilder
import java.util.*

fun LocalDateTime.format() = this.format(englishDateFormatter)

private val daysLookup = (1..31).associate { it.toLong() to getOrdinal(it) }

private val englishDateFormatter = DateTimeFormatterBuilder()
        .appendPattern("yyyy-MM-dd, hh:mm")
        .toFormatter(Locale.ENGLISH)

private fun getOrdinal(n: Int) = when {
    n in 11..13 -> "${n}th"
    n % 10 == 1 -> "${n}st"
    n % 10 == 2 -> "${n}nd"
    n % 10 == 3 -> "${n}rd"
    else -> "${n}th"
}

fun String.toSlug() = toLowerCase()
        .replace("\n", " ")
        .replace("[^a-z\\d\\s]".toRegex(), " ")
        .split(" ")
        .joinToString("-")
        .replace("-+".toRegex(), "-")

fun String.shorten(newLen: Int = 30) : String {
    return if (newLen in 1..length)
        this.substring(0, newLen - 1) + "..."
    else this
}

fun Article.render(showFullContent: Boolean = false) = HtmlController.RenderedArticle(
    id,
    title,
    if (showFullContent) content else content.shorten(140),
    if (author.isEmpty()) "Anonymous" else author,
    date.format()
)