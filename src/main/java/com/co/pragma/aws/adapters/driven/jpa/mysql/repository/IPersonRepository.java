package com.co.pragma.aws.adapters.driven.jpa.mysql.repository;

import com.co.pragma.aws.adapters.driven.jpa.mysql.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<PersonEntity, Integer> {

    boolean existsByIdOrEmail(Integer id, String email);

}
