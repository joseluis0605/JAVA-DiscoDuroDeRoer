package com.company;

public class Main {

    public static void main(String[] args) {


        Cuenta cuenta1= new Cuenta("pedro", 100);
        cuenta1.ingresarCantidad(100);
        System.out.println(cuenta1);
        cuenta1.retirarCantidad(105);
        System.out.println(cuenta1);


    }
}
