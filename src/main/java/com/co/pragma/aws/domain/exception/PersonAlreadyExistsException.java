package com.co.pragma.aws.domain.exception;

import com.co.pragma.aws.utils.Constants;

public class PersonAlreadyExistsException extends RuntimeException {
    public PersonAlreadyExistsException() {
        super(Constants.PERSON_ALREADY_EXISTS_EXCEPTION);
    }
}
