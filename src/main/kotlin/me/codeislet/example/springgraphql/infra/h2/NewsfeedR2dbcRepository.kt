package me.codeislet.example.springgraphql.infra.h2

import org.springframework.data.r2dbc.repository.R2dbcRepository


/**
 * @author Code Islet
 * @since 0.1.0
 */
interface NewsfeedR2dbcRepository: R2dbcRepository<NewsfeedEntity, String>
