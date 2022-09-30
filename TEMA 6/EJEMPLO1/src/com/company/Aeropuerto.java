package com.company;

public class Aeropuerto {

    String nombre;
    String pais;

    public Aeropuerto(String nombre, String pais){
        this.nombre=nombre;
        this.pais= pais;
    }

    public String toString(){
        return this.nombre+" esta en "+this.pais;
    }

    public String getNombre() {
        return nombre;
    }
}
