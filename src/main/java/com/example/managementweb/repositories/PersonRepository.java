package com.example.managementweb.repositories;

import com.example.managementweb.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository  extends JpaRepository<PersonEntity, Integer> {
}
