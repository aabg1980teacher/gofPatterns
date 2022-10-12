package co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.configurador;

import co.edu.javeriana.ingsoft.patterns.gof.mediador.dtos.Comando;
import co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.ManejadorComandos;

import java.util.HashMap;
import java.util.Map;

public class ConfiguradorMediador {
    private static ConfiguradorMediador instance;

    private Map<Class<?>, Class<?>> creadorInstancias;

    private ConfiguradorMediador() {
        creadorInstancias = new HashMap<>(0);
    }

    public static ConfiguradorMediador getInstance() {
        if(instance==null)
            instance = new ConfiguradorMediador();
        return instance;
    }

    public void registrarComando(Comando c, ManejadorComandos manejadorComandos) {
        creadorInstancias.put(c.getClass(), manejadorComandos.getClass());
    }

    public Object obtenerHandler(Class<? extends Comando> aClass) {
        return creadorInstancias.get(aClass);
    }
}
