package br.com.myrest.exceptions

import java.util.Date

class ExceptionResponse(
    val timeStamp: Date,
    val message: String?,
    val details: String
)