package com.example.study.core.exception

import com.example.study.core.response.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class CustomExceptionHandler {

    @ExceptionHandler(InvalidInputException::class)
    protected fun invalidInputException(ex: InvalidInputException): ResponseEntity<ErrorResponse> {
        val error = ErrorResponse(ex.message ?: "Not Exception Message")
        return ResponseEntity(error, HttpStatus.BAD_REQUEST)
    }
}