package com.company;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String dni;

    public Persona(String nombre, String apellido, int edad, String dni){
        this.nombre=nombre;
        this.apellido= apellido;
        this.edad= edad;
        this.dni=dni;
    }

    public String toString(){
        return this.nombre+" "+this.apellido+" edad: "+this.edad;
    }

    public String getNombre() {
        return nombre;
    }
}
