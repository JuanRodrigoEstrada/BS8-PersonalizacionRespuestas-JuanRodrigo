package com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller;

import com.bosonit.BP1AHJuanRodrigo.Persona.application.Port.UpdatePersonPort;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserInputDTO;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UpdateController {
    @Autowired
    UpdatePersonPort updatePersonPort;

    @PutMapping("/usuario/update/{id}")
    public UserOutputDTO updateUserByID(@PathVariable(value = "id") Integer id, @RequestBody UserInputDTO userInputDTO) {
        return updatePersonPort.updateUserByID(id, userInputDTO);
    }
}
