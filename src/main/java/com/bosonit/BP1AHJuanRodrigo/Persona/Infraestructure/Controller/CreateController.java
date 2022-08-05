package com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller;

import com.bosonit.BP1AHJuanRodrigo.Persona.application.CreatePersonuseCase;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserInputDTO;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CreateController {
    @Autowired
    CreatePersonuseCase createPersonuseCase;
    @PostMapping("/usuario/crearUsuario")
    public UserOutputDTO createUser(@RequestBody UserInputDTO userInputDTO)throws Exception{
        return createPersonuseCase.createUser(userInputDTO);
    }
}
