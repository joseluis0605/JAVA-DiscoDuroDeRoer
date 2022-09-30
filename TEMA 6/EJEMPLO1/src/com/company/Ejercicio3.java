package com.company;

import java.util.*;

public class Ejercicio3 {

    private Map<String, ArrayList<Vuelo>> mapaOrigen;
    private Map<String, ArrayList<Vuelo>> mapaDestino;
    private Set<String> ciudades;

    public Ejercicio3(){
        this.mapaOrigen= new HashMap<>();
        this.mapaDestino= new HashMap<>();
        this.ciudades= new HashSet<>();
    }

    public void addCiudad(String origen, String destino){
        Vuelo vuelo= new Vuelo(origen, destino);


        //MAPA INCLUYENDO CIUDADES DE ORIGEN
        ArrayList<Vuelo> aux= mapaOrigen.get(origen);
        if (aux==null){
            aux= new ArrayList<>();
            aux.add(vuelo);
        }else {
            aux.add(vuelo);
        }
        mapaOrigen.put(origen, aux);

        //MAPA INCLUYENDO CIUDADES DE DESTINO
        ArrayList<Vuelo> aux2= mapaDestino.get(destino);
        if (aux2==null){
            aux2= new ArrayList<>();
            aux2.add(vuelo);
        }else {
            aux2.add(vuelo);
        }
        mapaDestino.put(destino, aux2);

        //CONJUNTO DE CIUDADES
        ciudades.add(origen);
        ciudades.add(destino);
    }

    public void mostrarOrigen(String origen){
        System.out.println(mapaOrigen.get(origen));
    }

    public void mostrarDestino(String destino){
        System.out.println(mapaDestino.get(destino));
    }

    public void mostrarTodo(){

        for (Map.Entry<String, ArrayList<Vuelo>> listadoDeCadaUna : mapaOrigen.entrySet()){
            System.out.println(listadoDeCadaUna.getValue());
        }
    }

    public void mostrarCiudades(){
        System.out.println(ciudades);
    }


}
