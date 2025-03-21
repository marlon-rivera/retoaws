package com.co.pragma.aws.adapters.driving.http.mapper.request;

import com.co.pragma.aws.adapters.driving.http.dto.request.CreatePerson;
import com.co.pragma.aws.domain.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPersonRequestMapper {

    Person toModel(CreatePerson createPerson);

}
