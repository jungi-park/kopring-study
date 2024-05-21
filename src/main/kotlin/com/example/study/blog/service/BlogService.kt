package com.example.study.blog.service

import com.example.study.blog.dto.BlogDto

class BlogService {
    fun searchKako(blogDto: BlogDto): String? {
        println(blogDto.toString())
        return "SearchKako"
    }
}