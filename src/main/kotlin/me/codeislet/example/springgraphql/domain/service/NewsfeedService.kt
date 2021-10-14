package me.codeislet.example.springgraphql.domain.service

import me.codeislet.example.springgraphql.domain.Newsfeed
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


/**
 * @author Code Islet
 * @since 0.1.0
 */
interface NewsfeedService {

    fun saveNewsfeed(newsfeed: Newsfeed): Mono<Newsfeed>

    fun getNewsfeedById(id: String): Mono<Newsfeed?>

    fun getNewsfeeds(): Flux<Newsfeed>
}
