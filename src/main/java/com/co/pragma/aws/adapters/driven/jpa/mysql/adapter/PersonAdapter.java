package com.co.pragma.aws.adapters.driven.jpa.mysql.adapter;

import com.co.pragma.aws.adapters.driven.jpa.mysql.mapper.IPersonEntityMapper;
import com.co.pragma.aws.adapters.driven.jpa.mysql.repository.IPersonRepository;
import com.co.pragma.aws.domain.model.Person;
import com.co.pragma.aws.domain.spi.IPersonPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonAdapter implements IPersonPersistencePort {

    private final IPersonRepository personRepository;
    private final IPersonEntityMapper personEntityMapper;

    @Override
    public void savePerson(Person person) {
        personRepository.save(personEntityMapper.toEntity(person));
    }

    @Override
    public boolean existsPersonByIdOrEmail(Integer id, String email) {
        return personRepository.existsByIdOrEmail(id, email);
    }

}
