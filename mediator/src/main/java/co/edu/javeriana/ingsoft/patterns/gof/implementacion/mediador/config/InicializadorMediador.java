package co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.config;

import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.dtos.base.Persona;
import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.dtos.comands.CrearPersonaComando;
import co.edu.javeriana.ingsoft.patterns.gof.implementacion.mediador.logica.manejadores.comandos.ManejadorCrearPersonasComando;
import co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.configurador.ConfiguradorMediador;

public class InicializadorMediador {

    ConfiguradorMediador configuradorMediador = ConfiguradorMediador.getInstance();

    public void registrarMediadores() {
        configuradorMediador.registrarComando(new CrearPersonaComando(new Persona()),new ManejadorCrearPersonasComando());
    }
}
