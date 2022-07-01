package jp.ac.it_college.std.s21013.news_manager.domain.repository

import jp.ac.it_college.std.s21013.news_manager.infrastructure.database.record.UsersRecord

interface UserRepository {
    fun find(username: String) : UsersRecord?
    fun register(user: UsersRecord)
}