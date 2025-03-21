package com.co.pragma.aws.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data
@Builder
@ToString
public class Person {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

}
