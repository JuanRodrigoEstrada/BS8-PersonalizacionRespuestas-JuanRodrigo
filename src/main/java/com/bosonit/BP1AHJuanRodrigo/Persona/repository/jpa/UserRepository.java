package com.bosonit.BP1AHJuanRodrigo.Persona.repository.jpa;

import com.bosonit.BP1AHJuanRodrigo.Persona.Domain.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<PersonEntity, Integer> {
    List<PersonEntity> findByName(String nombre);
}