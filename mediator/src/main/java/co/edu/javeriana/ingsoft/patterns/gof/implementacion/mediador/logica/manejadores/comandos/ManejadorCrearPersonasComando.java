package co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.manejadores.comandos;

import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.dtos.comands.CrearPersonaComando;
import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.dtos.base.Persona;
import co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.ManejadorComandos;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@NoArgsConstructor
public class ManejadorCrearPersonasComando implements ManejadorComandos<CrearPersonaComando, Persona> {



    @Override
    public Persona ejecutarMetodo(CrearPersonaComando c) {

        log.info("Persona a guardar " + c.getDatosPersona().toString());
        log.info("Guardando " + c.getDatosPersona().toString());

        return c.getDatosPersona();
    }


}
