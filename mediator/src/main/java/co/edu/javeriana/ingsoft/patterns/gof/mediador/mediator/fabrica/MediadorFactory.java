package co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.fabrica;

import co.edu.javeriana.ingsoft.patterns.gof.mediador.dtos.Comando;
import co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.ManejadorComandos;

public interface MediadorFactory {

    ManejadorComandos crearMediador(Comando comando);


}
