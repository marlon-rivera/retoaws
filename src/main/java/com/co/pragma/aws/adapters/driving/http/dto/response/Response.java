package com.co.pragma.aws.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class Response {

    private final String message;
    private final String status;
    private final LocalDateTime timestamp;

}
