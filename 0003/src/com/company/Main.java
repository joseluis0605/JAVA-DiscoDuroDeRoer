package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("introduce el tamaño del array");
        int valor= input.nextInt();
        input.nextLine();

        Password vector[]= new Password[valor];

        for (int i=0;i<vector.length;i++){
            String password= input.nextLine();
            vector[i]= new Password(password);
        }

        for (int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
            System.out.println(vector[i].esFuerte());
        }


        input.close();
    }
}
