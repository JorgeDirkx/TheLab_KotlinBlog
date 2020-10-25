package com.jorgedirkx

import org.springframework.data.repository.CrudRepository

class Repositories {
    interface ArticleRepository : CrudRepository<Article, Long> {
        fun findBySlug(slug: String): Article?
        fun findAllByOrderByAddedAtDesc(): Iterable<Article>
    }

    interface UserRepository : CrudRepository<User, Long> {
        fun findByLogin(login: String): User?
    }
}