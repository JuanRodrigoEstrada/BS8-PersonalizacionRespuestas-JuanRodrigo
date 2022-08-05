package com.bosonit.BP1AHJuanRodrigo.Persona.application;

import com.bosonit.BP1AHJuanRodrigo.Persona.application.Port.UpdatePersonPort;
import com.bosonit.BP1AHJuanRodrigo.Persona.Domain.PersonEntity;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserInputDTO;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserOutputDTO;
import com.bosonit.BP1AHJuanRodrigo.Persona.repository.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UpdatePersonuserCase implements UpdatePersonPort {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserOutputDTO updateUserByID(Integer id, UserInputDTO userInputDTO) {
        PersonEntity personEntity = userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE));
        PersonEntity.update(personEntity);
        userRepository.save(personEntity);
        return new UserOutputDTO(personEntity);
    }
}
