package com.co.pragma.aws.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PersonResponse {

    private String firstName;
    private String lastName;
    private String email;

}
