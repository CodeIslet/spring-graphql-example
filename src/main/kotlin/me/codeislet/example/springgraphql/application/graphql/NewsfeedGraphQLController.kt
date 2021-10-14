package me.codeislet.example.springgraphql.application.graphql

import me.codeislet.example.springgraphql.application.response.NewsfeedResponse
import me.codeislet.example.springgraphql.domain.service.NewsfeedService
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Flux


/**
 * @author Code Islet
 * @since 0.1.0
 */
@Controller
class NewsfeedGraphQLController(val newsfeedService: NewsfeedService) {

    @SchemaMapping(typeName = "Query", field = "newsfeeds")
    fun newsfeeds(): Flux<NewsfeedResponse> {
        return newsfeedService.getNewsfeeds().map { NewsfeedResponse(it.id, it.author, it.content) }
    }
}
