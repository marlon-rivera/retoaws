package com.co.pragma.aws.adapters.driving.http.dto.request;

import com.co.pragma.aws.utils.Constants;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreatePerson {

    @NotNull(message = Constants.PERSON_ID_MUST_MANDATORY)
    private Integer id;

    @NotEmpty(message = Constants.PERSON_FIRST_NAME_MUST_MANDATORY)
    private String firstName;

    @NotEmpty(message = Constants.PERSON_LAST_NAME_MUST_MANDATORY)
    private String lastName;

    @NotEmpty(message = Constants.PERSON_EMAIL_MUST_MANDATORY)
    private String email;

}
