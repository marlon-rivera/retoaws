package com.co.pragma.aws.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;


public record Response(String message, String status, LocalDateTime timestamp) {

}
