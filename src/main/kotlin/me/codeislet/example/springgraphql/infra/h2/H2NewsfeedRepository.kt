package me.codeislet.example.springgraphql.infra.h2

import me.codeislet.example.springgraphql.domain.Newsfeed
import me.codeislet.example.springgraphql.domain.repository.NewsfeedRepository
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.LocalDateTime


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Primary
@Repository
class H2NewsfeedRepository(val newsfeedR2dbcRepository: NewsfeedR2dbcRepository): NewsfeedRepository {

    override fun findAll(): Flux<Newsfeed> {
        return newsfeedR2dbcRepository.findAll().map { it.toNewsfeed() }
    }

    override fun findById(id: String): Mono<Newsfeed?> {
        return newsfeedR2dbcRepository.findById(id).map { it.toNewsfeed() }
    }

    override fun save(newsfeed: Newsfeed): Mono<Newsfeed> {
        return newsfeedR2dbcRepository.save(
            NewsfeedEntity(newsfeed.id, newsfeed.author, newsfeed.content, LocalDateTime.now())
        ).map { it.toNewsfeed() }
    }
}
