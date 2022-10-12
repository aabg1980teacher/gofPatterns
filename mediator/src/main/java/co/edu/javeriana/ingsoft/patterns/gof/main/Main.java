package co.edu.javeriana.ingsoft.patterns.gof.main;

import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.config.InicializadorMediador;
import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.facade.PersonaComandosFacade;
import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.dtos.base.Persona;
import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.dtos.comands.CrearPersonaComando;

public class Main {

    public static void main(String ars[]) {
        InicializadorMediador inicializadorMediador = new InicializadorMediador();
        inicializadorMediador.registrarMediadores();
        PersonaComandosFacade facade = new PersonaComandosFacade();
        Persona persona = new Persona();
        persona.setNombres("Andres Alexander");
        persona.setApellidos("Barrera Garavito");
        CrearPersonaComando crearPersonaComando = new CrearPersonaComando(persona);
        facade.crearPersona(crearPersonaComando);
    }
}
