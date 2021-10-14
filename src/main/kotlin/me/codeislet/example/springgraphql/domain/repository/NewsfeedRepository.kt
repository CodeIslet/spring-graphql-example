package me.codeislet.example.springgraphql.domain.repository

import me.codeislet.example.springgraphql.domain.Newsfeed
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Repository
interface NewsfeedRepository {

    fun findById(id: String): Mono<Newsfeed?>

    fun findAll(): Flux<Newsfeed>

    fun save(newsfeed: Newsfeed): Mono<Newsfeed>
}
