package com.bosonit.BP1AHJuanRodrigo.Persona.application.Port;

import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserInputDTO;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserOutputDTO;
import org.springframework.web.bind.annotation.PathVariable;

public interface UpdatePersonPort {
    public UserOutputDTO updateUserByID(@PathVariable(value = "id") Integer id, UserInputDTO usuarioInputDTO);
}
