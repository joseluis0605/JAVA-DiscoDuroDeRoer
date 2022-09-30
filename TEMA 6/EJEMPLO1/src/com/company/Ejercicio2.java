package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ejercicio2 {

    private Map<String, Aeropuerto> mapa;

    public Ejercicio2(){
        this.mapa= new HashMap<>();
    }

    public void addMapa(String nombre, Aeropuerto aeropuerto){
        this.mapa.put(nombre, aeropuerto);
    }

    public void removeMapa(Aeropuerto aeropuerto){
        String palabra= aeropuerto.getNombre();
        this.mapa.remove(palabra);
    }

    public void getMapa(String ciudad){
        System.out.println(mapa.get(ciudad));
    }

    public void mostrarMapa(){

        for (Map.Entry<String, Aeropuerto> n: mapa.entrySet()){
            System.out.println(n.getValue());
        }
    }
}
