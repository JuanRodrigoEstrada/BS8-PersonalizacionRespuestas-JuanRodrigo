package com.bosonit.BP1AHJuanRodrigo.Persona.application;

import com.bosonit.BP1AHJuanRodrigo.Persona.application.Port.ReadPersonPort;
import com.bosonit.BP1AHJuanRodrigo.Persona.Domain.PersonEntity;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserOutputDTO;
import com.bosonit.BP1AHJuanRodrigo.Persona.repository.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReadPersonuserCase implements ReadPersonPort {

    @Autowired
    UserRepository userRepository;


    @Override
    public UserOutputDTO getUserByID(Integer id) {
        PersonEntity personEntity = userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return new UserOutputDTO(personEntity);
    }


    @Override
    public List<UserOutputDTO> getAllUsers() {
        List<UserOutputDTO> userOutputDTOList = new ArrayList<>();
        if (userRepository.findAll() != null) {
            userRepository.findAll().forEach(persona -> {
                UserOutputDTO userOutputDTO = new UserOutputDTO(persona);
                userOutputDTOList.add(userOutputDTO);
            });
            return userOutputDTOList;

        }
        List<UserOutputDTO> userOutputDTOListEmpty = new ArrayList<>();
        return userOutputDTOListEmpty;

    }

    @Override
    public List<UserOutputDTO> getUserByName(String name) {
        List<UserOutputDTO> userOutputDTOList = new ArrayList<>();
        if (userRepository.findByName(name) != null) {
            userRepository.findByName(name).forEach(persona -> {
                UserOutputDTO userOutputDTO = new UserOutputDTO(persona);
                userOutputDTOList.add(userOutputDTO);
            });
            return userOutputDTOList;
        }
        List<UserOutputDTO> userOutputDTOListEmpty = new ArrayList<>();
        return userOutputDTOListEmpty;
    }
}
