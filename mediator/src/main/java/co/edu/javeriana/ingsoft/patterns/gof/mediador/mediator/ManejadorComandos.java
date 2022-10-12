package co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator;

import co.edu.javeriana.ingsoft.patterns.gof.mediador.dtos.Comando;

public interface ManejadorComandos<Comando, R> {

    public <R> R ejecutarMetodo(Comando c);
}
