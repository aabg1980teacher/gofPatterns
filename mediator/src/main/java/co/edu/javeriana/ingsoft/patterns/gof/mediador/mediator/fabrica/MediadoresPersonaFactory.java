package co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.fabrica;


import co.edu.javeriana.ingsoft.patterns.gof.mediador.dtos.Comando;
import co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.ManejadorComandos;
import co.edu.javeriana.ingsoft.patterns.gof.mediador.mediator.configurador.ConfiguradorMediador;
import lombok.extern.java.Log;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

@Log
public class MediadoresPersonaFactory implements MediadorFactory {

    private ConfiguradorMediador configuradorMediador;

    public MediadoresPersonaFactory() {
        configuradorMediador = ConfiguradorMediador.getInstance();
    }

    @Override
    public ManejadorComandos crearMediador(Comando comando) {

        try {
            Class<ManejadorComandos> manejadorComandosClass = (Class<ManejadorComandos>) configuradorMediador.obtenerHandler(comando.getClass());
            Constructor constructor = manejadorComandosClass.getConstructor(null);
            return (ManejadorComandos) constructor.newInstance(null);
        }
        catch (NoSuchMethodException ne) {
            throw new RuntimeException("Constructor para el comando no encontrado " + ne.getMessage());
        } catch (InvocationTargetException e) {
            throw new RuntimeException("No se puede encontrar el constructor " + e.getMessage());
        } catch (InstantiationException e) {
            throw new RuntimeException("No se puede instanciar el objecto " + e.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException("No se puede acceder el constructor " + e.getMessage());
        }
    }


}
