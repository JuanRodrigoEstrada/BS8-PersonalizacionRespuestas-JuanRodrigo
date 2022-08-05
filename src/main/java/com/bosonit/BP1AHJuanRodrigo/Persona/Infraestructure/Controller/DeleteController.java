package com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller;

import com.bosonit.BP1AHJuanRodrigo.Persona.application.Port.DeletePersonPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class DeleteController {
    @Autowired
    DeletePersonPort deletePersonPort;

    @DeleteMapping("/usuario/delete/{id}")
    public void deleteByID(@PathVariable(value = "id") Integer id) {
        deletePersonPort.deleteByID(id);
    }
}



