package com.co.pragma.aws.domain.spi;

import com.co.pragma.aws.domain.model.Person;

import java.util.Optional;

public interface IPersonPersistencePort {

    void savePerson(Person person);
    boolean existsPersonByIdOrEmail(Integer id, String email);
    Optional<Person> getPersonById(Integer id);

}
