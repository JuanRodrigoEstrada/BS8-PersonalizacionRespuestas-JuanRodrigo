package com.bosonit.BP1AHJuanRodrigo.Persona.Domain;

import com.bosonit.BP1AHJuanRodrigo.Persona.Infraestructure.Controller.DTO.UserInputDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Personas")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_persona")
    private Integer id_persona;
    @Column(name = "Usuario", nullable = false)
    private String user;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Nombre", nullable = false)
    private String name;

    @Column(name = "Apellidos", nullable = false)
    private String surname;
    @Column(name = "email_compañía", nullable = false)
    private String company_email;

    @Column(name = "email_personal", nullable = false)
    private String personal_email;

    @Column(name = "Ciudad", nullable = false)
    private String city;

    @Column(name = "Activo", nullable = false)
    private Boolean active;

    @Column(name = "fecha_inicio", nullable = false)
    private Date created_date;

    @Column(name = "Imagen_URL")
    private String imagen_url;

    @Column(name = "Fecha_fin")
    private Date termination_date;


    public PersonEntity(UserInputDTO userInputDTO) {
        if (userInputDTO == null) return;
        id_persona = userInputDTO.getId_persona();
        user = userInputDTO.getUser();
        password = userInputDTO.getPassword();
        name = userInputDTO.getName();
        surname = userInputDTO.getSurname();
        company_email = userInputDTO.getCompany_email();
        personal_email = userInputDTO.getPersonal_email();
        city = userInputDTO.getCity();
        active = userInputDTO.getActive();
        created_date = userInputDTO.getCreated_date();
        imagen_url = userInputDTO.getImagen_url();
        termination_date = userInputDTO.getTermination_date();
    }

    public static void update(PersonEntity personEntity) {

    }

    public void update(UserInputDTO userInputDTO) {
        if (userInputDTO == null) return;
        id_persona = userInputDTO.getId_persona();
        user = userInputDTO.getUser();
        password = userInputDTO.getPassword();
        name = userInputDTO.getName();
        surname = userInputDTO.getSurname();
        company_email = userInputDTO.getCompany_email();
        personal_email = userInputDTO.getPersonal_email();
        city = userInputDTO.getCity();
        active = userInputDTO.getActive();
        created_date = userInputDTO.getCreated_date();
        imagen_url = userInputDTO.getImagen_url();
        termination_date = userInputDTO.getTermination_date();
    }



}
