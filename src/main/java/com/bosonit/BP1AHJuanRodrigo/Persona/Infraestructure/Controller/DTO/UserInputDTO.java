package com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

    @Data
    public class UserInputDTO implements Serializable {
        private Integer id_persona;
        private String user;
        private String password;
        private String name;
        private String surname;
        private String company_email;
        private String personal_email;
        private String city;
        private Boolean active;
        private Date created_date;
        private String imagen_url;
        private Date termination_date;


    }



