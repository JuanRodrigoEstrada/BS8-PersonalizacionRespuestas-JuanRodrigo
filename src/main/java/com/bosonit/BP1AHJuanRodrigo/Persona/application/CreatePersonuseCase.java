package com.bosonit.BP1AHJuanRodrigo.Persona.application;

import com.bosonit.BP1AHJuanRodrigo.Persona.application.Port.CreatePersonPort;
import com.bosonit.BP1AHJuanRodrigo.Persona.Domain.PersonEntity;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserInputDTO;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserOutputDTO;
import com.bosonit.BP1AHJuanRodrigo.Persona.repository.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePersonuseCase implements CreatePersonPort {
@Autowired
    UserRepository userRepository;

@Override
   public UserOutputDTO createUser(UserInputDTO userInputDTO)throws Exception{
    if (userInputDTO.getUser().length() < 6 || userInputDTO.getUser().length() > 10)
        throw new Exception("El usuario debe tener entre 6 y 10 carácteres");


    PersonEntity personEntity= new PersonEntity(userInputDTO);
    userRepository.save(personEntity);
    UserOutputDTO userOutputDTO = new UserOutputDTO(personEntity);
    return userOutputDTO;
 }
}


