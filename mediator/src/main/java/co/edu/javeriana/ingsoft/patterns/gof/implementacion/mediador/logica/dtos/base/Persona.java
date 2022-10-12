package co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.dtos.base;

import lombok.Data;

import java.io.Serializable;

@Data
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombres;
    private String apellidos;

}
