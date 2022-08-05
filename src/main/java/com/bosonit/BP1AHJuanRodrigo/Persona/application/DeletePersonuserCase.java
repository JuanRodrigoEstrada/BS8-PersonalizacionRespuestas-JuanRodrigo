package com.bosonit.BP1AHJuanRodrigo.Persona.application;

import com.bosonit.BP1AHJuanRodrigo.Persona.application.Port.DeletePersonPort;
import com.bosonit.BP1AHJuanRodrigo.Persona.Domain.PersonEntity;
import com.bosonit.BP1AHJuanRodrigo.Persona.repository.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class DeletePersonuserCase implements DeletePersonPort {
@Autowired
    UserRepository userRepository;
    public void deleteByID(Integer id) {
        PersonEntity personEntity= userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE));
        userRepository.delete(personEntity);
       userRepository.save(personEntity);
    }

}
