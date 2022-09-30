package com.company;

public class Main {

    public static void main(String[] args) {

        Gestor gestor= new Gestor();

        gestor.addPersona("nombre1","apellido1", 20, "1");
        gestor.addPersona("nombre3","apellido2", 20, "2");
        gestor.addPersona("nombre3","apellido3", 20, "3");
        gestor.addPersona("nombre3","apellido4", 20, "4");
        gestor.addPersona("nombre1","apellido5", 20, "5");
        gestor.addPersona("nombre1","apellido6", 20, "6");
        gestor.addPersona("nombre1","apellido7", 20, "7");

        gestor.mostrarTodaInfo();

    }
}
