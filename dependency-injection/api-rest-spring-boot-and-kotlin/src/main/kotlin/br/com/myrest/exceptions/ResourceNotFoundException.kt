package br.com.myrest.exceptions

import jakarta.annotation.Resource
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.*

@ResponseStatus(HttpStatus.NOT_FOUND)
class ResourceNotFoundException (exception: String?): RuntimeException(exception)