package com.co.pragma.aws.domain.exception;

import com.co.pragma.aws.utils.Constants;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException() {
        super(Constants.PERSON_NOT_FOUND_EXCEPTION);
    }
}
