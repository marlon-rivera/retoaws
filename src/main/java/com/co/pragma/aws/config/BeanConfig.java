package com.co.pragma.aws.config;

import com.co.pragma.aws.adapters.driven.jpa.mysql.adapter.PersonAdapter;
import com.co.pragma.aws.adapters.driven.jpa.mysql.mapper.IPersonEntityMapper;
import com.co.pragma.aws.adapters.driven.jpa.mysql.repository.IPersonRepository;
import com.co.pragma.aws.domain.api.IPersonServicePort;
import com.co.pragma.aws.domain.api.usecase.PersonUseCaseImpl;
import com.co.pragma.aws.domain.spi.IPersonPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfig {

    private final IPersonRepository personRepository;
    private final IPersonEntityMapper personEntityMapper;

    @Bean
    public IPersonPersistencePort personPersistencePort() {
        return new PersonAdapter(personRepository, personEntityMapper);
    }

    @Bean
    public IPersonServicePort personServicePort() {
        return new PersonUseCaseImpl(personPersistencePort());
    }
}
