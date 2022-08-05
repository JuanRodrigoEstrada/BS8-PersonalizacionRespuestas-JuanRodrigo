package com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO;

import com.bosonit.BP1AHJuanRodrigo.Persona.Domain.PersonEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

    @Data
    public class UserOutputDTO implements Serializable {
        private Integer id_persona;
        private String usuario;
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

        public UserOutputDTO(PersonEntity userEntity) {
            if (userEntity == null) return;
            id_persona = userEntity.getId_persona();
            usuario = userEntity.getUser();
            password = userEntity.getPassword();
            name = userEntity.getName();
            surname = userEntity.getSurname();
            company_email = userEntity.getCompany_email();
            personal_email = userEntity.getPersonal_email();
            city = userEntity.getCity();
            active = userEntity.getActive();
            created_date =  userEntity.getCreated_date();
            imagen_url = userEntity.getImagen_url();
            termination_date = userEntity.getTermination_date();
        }


    }
