package com.bosonit.BP1AHJuanRodrigo.Persona.application.Port;

import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserInputDTO;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserOutputDTO;

public interface CreatePersonPort {


    UserOutputDTO createUser(UserInputDTO userInputDTO)throws Exception;
}


