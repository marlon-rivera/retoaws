package com.co.pragma.aws.adapters.driven.jpa.mysql.mapper;

import com.co.pragma.aws.adapters.driven.jpa.mysql.entity.PersonEntity;
import com.co.pragma.aws.domain.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPersonEntityMapper {

    PersonEntity toEntity(Person person);

    Person toDomain(PersonEntity personEntity);

}
