package me.codeislet.example.springgraphql.domain.service

import me.codeislet.example.springgraphql.domain.Newsfeed
import me.codeislet.example.springgraphql.domain.repository.NewsfeedRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Service
class NewsfeedServiceImpl(val newsfeedRepository: NewsfeedRepository): NewsfeedService {

    override fun saveNewsfeed(newsfeed: Newsfeed): Mono<Newsfeed> {
        return newsfeedRepository.save(newsfeed)
    }

    override fun getNewsfeedById(id: String): Mono<Newsfeed?> {
        return newsfeedRepository.findById(id)
    }

    override fun getNewsfeeds(): Flux<Newsfeed> {
        return newsfeedRepository.findAll()
    }
}
