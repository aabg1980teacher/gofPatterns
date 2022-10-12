package co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.dtos.comands;

import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.dtos.base.Persona;
import co.edu.javeriana.ingsoft.patterns.gof.mediador.dtos.Comando;
import lombok.Data;

@Data
public class CrearPersonaComando implements Comando {

    public CrearPersonaComando(Persona persona) {
        datosPersona = persona;
    }

    private Persona datosPersona;

}
