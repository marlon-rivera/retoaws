package com.co.pragma.aws.adapters.driving.http.controller;

import com.co.pragma.aws.adapters.driving.http.dto.request.CreatePerson;
import com.co.pragma.aws.adapters.driving.http.dto.response.PersonResponse;
import com.co.pragma.aws.adapters.driving.http.dto.response.Response;
import com.co.pragma.aws.adapters.driving.http.mapper.request.IPersonRequestMapper;
import com.co.pragma.aws.adapters.driving.http.mapper.response.IPersonResponseMapper;
import com.co.pragma.aws.domain.api.IPersonServicePort;
import com.co.pragma.aws.utils.Constants;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final IPersonServicePort personServicePort;
    private final IPersonRequestMapper personRequestMapper;
    private final IPersonResponseMapper personResponseMapper;

    @PostMapping("/create")
    public ResponseEntity<Response> createPerson(@Valid @RequestBody CreatePerson createPerson) {
        personServicePort.savePerson(personRequestMapper.toModel(createPerson));
        return ResponseEntity.ok().body(new Response(Constants.PERSON_CREATED_SUCCESSFULLY, HttpStatus.CREATED.toString(), LocalDateTime.now()));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<PersonResponse> getPersonById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(personResponseMapper.toDto(personServicePort.getPersonById(id)));
    }

}
