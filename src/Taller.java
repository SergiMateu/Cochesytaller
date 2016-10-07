import java.util.Comparator;

import java.util.Map;

import java.util.Set;

import java.util.TreeMap;

public class Taller {

    //en treemap primer valor es la key(Persona en aquest cas) y el segon es value(coche)
    private Map<Persona, Coche> reparaciones =

            new TreeMap<>(Comparator.comparing(Persona::getNumSS));

    public void registrarReparacion(Persona persona, Coche coche) {

        reparaciones.putIfAbsent(persona, coche);

    }


    public Coche obtenerCoche(Persona persona){

        return reparaciones.get(persona);
    }



    public Set<Persona>obtenerClientes(){
        return reparaciones.keySet();

    }

}