package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Persona persona1, persona2, persona3;

        Scanner input= new Scanner(System.in);

        System.out.println("introduce el nombre: ");
        String nombre= input.nextLine();
        System.out.println("introduce la edad");
        int edad= input.nextInt();
        input.nextLine();
        System.out.println("introduce el sexo, altura y peso");
        char sexo= input.nextLine().charAt(0);
        double altura= input.nextDouble();
        int peso= input.nextInt();
        input.nextLine();

        persona1= new Persona(nombre, edad, "", sexo, altura, peso);

        System.out.println("introduce el nombre: ");
        nombre= input.nextLine();
        System.out.println("introduce la edad");
        edad= input.nextInt();
        input.nextLine();
        System.out.println("introduce el sexo");
        sexo= input.nextLine().charAt(0);

        persona2= new Persona(nombre, edad, sexo);

        persona3= new Persona();

        System.out.println(persona1.esMayorEdad());
        System.out.println(persona2.esMayorEdad());
        System.out.println(persona3.esMayorEdad());

        System.out.println(persona1.calcularIMC());
        System.out.println(persona2.calcularIMC());
        System.out.println(persona3.calcularIMC());

        input.close();
    }
}
