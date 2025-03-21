package com.co.pragma.aws.config.exceptionhandler;

import java.time.LocalDateTime;

public record ExceptionResponse(String message, String status, LocalDateTime localDateTime) {

}
