package co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.facade;

import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.dtos.base.Persona;
import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.dtos.comands.CrearPersonaComando;
import co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.ManejadorComandos;
import co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.fabrica.MediadorFactory;
import co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.fabrica.MediadoresPersonaFactory;

public class PersonaComandosFacade {

    private ManejadorComandos<CrearPersonaComando, Persona> mediador;

    MediadorFactory mediadorFactory = new MediadoresPersonaFactory();

    public PersonaComandosFacade() {
        mediador = mediadorFactory.crearMediador(new CrearPersonaComando(new Persona()));
    }

    /**
     *
     * */
    public Persona crearPersona(CrearPersonaComando crearPersonaComando) {
        return mediador.ejecutarMetodo(crearPersonaComando);
    }
}
