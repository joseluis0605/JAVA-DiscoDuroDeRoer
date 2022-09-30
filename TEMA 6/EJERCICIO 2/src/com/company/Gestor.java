package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gestor {

    private Map<String, ArrayList<Persona>> mapaNombre;
    private List<Persona> listaPersona;

    public Gestor(){
        this.mapaNombre= new HashMap<>();
        this.listaPersona= new ArrayList<>();
    }

    public void addPersona(String nombre, String apellido, int edad, String dni){
        Persona persona= new Persona(nombre, apellido, edad, dni);
        ArrayList<Persona> aux= mapaNombre.get(nombre);
        if (aux==null){
            aux= new ArrayList<>();
            aux.add(persona);
        }else {
            aux.add(persona);
        }
        mapaNombre.put(nombre, aux);
    }

    public void mostrarTodaInfo(){
        for(Map.Entry<String, ArrayList<Persona>> dato: mapaNombre.entrySet()){
            System.out.println("*************CLAVE: "+dato.getKey());
            System.out.println(dato.getValue());
        }
    }
}
