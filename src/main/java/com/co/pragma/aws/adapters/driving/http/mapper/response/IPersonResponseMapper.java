package com.co.pragma.aws.adapters.driving.http.mapper.response;

import com.co.pragma.aws.adapters.driving.http.dto.response.PersonResponse;
import com.co.pragma.aws.domain.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPersonResponseMapper {

    PersonResponse toDto(Person person);

}
