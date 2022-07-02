package jp.ac.it_college.std.s21013.news_manager.domain.model

data class NewsWithCategoryModel(
    val news: NewsModel,
    val category: CategoryModel?
){
    val isCategory: Boolean
        get() = category != null
}