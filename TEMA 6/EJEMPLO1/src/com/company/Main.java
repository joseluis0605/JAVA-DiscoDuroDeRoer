package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Ejercicio3 ejercicio3 = new Ejercicio3();

        ejercicio3.addCiudad("madrid", "viena");
        ejercicio3.addCiudad("madrid", "budapest");
        ejercicio3.addCiudad("madrid", "paris");
        ejercicio3.addCiudad("paris", "viena");
        ejercicio3.addCiudad("londres", "viena");
        ejercicio3.addCiudad("moscu", "viena");

        //ejercicio3.mostrarTodo();
        ejercicio3.mostrarCiudades();
    }


}
