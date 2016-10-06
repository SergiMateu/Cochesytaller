import java.util.Comparator;

import java.util.Map;

import java.util.Set;

import java.util.TreeMap;

public class Taller {

    private Map<Persona, Coche> reparaciones =

            new TreeMap<>(Comparator.comparing(Persona::getNumSS));

    public Coche registrarReparacion(Persona persona, Coche coche)

    {
        if(!reparaciones.containsKey(persona.getDni()) && (!reparaciones.containsKey(coche.getMatricula()))) {

            reparaciones.put(persona, coche);
        }
        return null;
    }


    public Coche obtenerCoche(Persona persona){

    }

    public Set<Persona>obtenerClientes(){

    }

}