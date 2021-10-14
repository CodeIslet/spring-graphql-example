package me.codeislet.example.springgraphql.infra.h2

import me.codeislet.example.springgraphql.domain.Newsfeed
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Table("newsfeed")
data class NewsfeedEntity(@Id val id: String, val author: String, val content: String, val createdAt: LocalDateTime) {

    fun toNewsfeed(): Newsfeed {
        return Newsfeed(id, author, content, createdAt)
    }
}
