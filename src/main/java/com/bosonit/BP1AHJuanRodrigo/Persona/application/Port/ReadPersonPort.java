package com.bosonit.BP1AHJuanRodrigo.Persona.application.Port;

import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserOutputDTO;

import java.util.List;

public interface ReadPersonPort {
    UserOutputDTO getUserByID(Integer id);

    List<UserOutputDTO> getAllUsers();

    List<UserOutputDTO> getUserByName(String name);
}

