package me.codeislet.example.springgraphql.domain

import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
data class Newsfeed(val id: String, val author: String, val content: String, val createdAt: LocalDateTime?) {
    constructor(id: String, author: String, content: String): this(id, author, content, null)
}
