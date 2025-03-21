package com.co.pragma.aws.domain.api.usecase;

import com.co.pragma.aws.domain.api.IPersonServicePort;
import com.co.pragma.aws.domain.exception.PersonAlreadyExistsException;
import com.co.pragma.aws.domain.model.Person;
import com.co.pragma.aws.domain.spi.IPersonPersistencePort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonUseCaseImpl implements IPersonServicePort {

    private final IPersonPersistencePort personPersistencePort;

    @Transactional
    @Override
    public void savePerson(Person person) {
        if(personPersistencePort.existsPersonByIdOrEmail(person.getId(), person.getEmail())) {
            throw new PersonAlreadyExistsException();
        }
        personPersistencePort.savePerson(person);
    }

}
