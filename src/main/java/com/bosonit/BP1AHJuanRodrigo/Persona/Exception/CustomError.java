package com.bosonit.BP1AHJuanRodrigo.Persona.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class CustomError {
    private Date timestamp;
    private int httpCode;
    private String mensaje;

    public CustomError(Date timestamp, String message, int httpCode) {

    }
}
