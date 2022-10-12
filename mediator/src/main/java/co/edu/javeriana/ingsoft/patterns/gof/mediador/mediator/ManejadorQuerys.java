package co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator;

import co.edu.javeriana.ingsoft.patterns.gof.mediador.dtos.Comando;
import co.edu.javeriana.ingsoft.patterns.gof.mediador.dtos.Querys;

public interface ManejadorQuerys {
    public <R> R ejecutarConsulta(Querys c);
}
