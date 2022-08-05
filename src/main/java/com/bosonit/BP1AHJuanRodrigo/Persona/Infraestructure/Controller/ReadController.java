package com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller;

import com.bosonit.BP1AHJuanRodrigo.Persona.application.Port.ReadPersonPort;
import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


    @RestController
    public class ReadController {

        @Autowired
        ReadPersonPort readPersonPort;

        @GetMapping("/usuario/read/id/{id}")
        public UserOutputDTO getUserByID(@PathVariable(value = "id") Integer id) {
            return readPersonPort.getUserByID(id);
        }

        @GetMapping("/usuario/read/all")
        public List<UserOutputDTO> getAllUsers() {
            return readPersonPort.getAllUsers();
        }

        @GetMapping("/usuario/read/name/{nombre}")
        public List<UserOutputDTO> getUserByName(@PathVariable(value = "nombre") String nombre) {
            return readPersonPort.getUserByName(nombre);
        }
    }

