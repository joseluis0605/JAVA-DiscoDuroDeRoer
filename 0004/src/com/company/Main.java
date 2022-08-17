package com.company;

public class Main {

    public static void main(String[] args) {

        Gestor gestor= new Gestor(10);

        Lavadora lavadora1= new Lavadora(150, 6);
        Lavadora lavadora2= new Lavadora(500, 3);
        Lavadora lavadora3= new Lavadora(100,9 );
        Lavadora lavadora4= new Lavadora(600, 8);
        Lavadora lavadora5= new Lavadora(300, 2);

        Television television1= new Television(150, 6);
        Television television2= new Television(50, 6);
        Television television3= new Television(900, 1);
        Television television4= new Television(200, 60);
        Television television5= new Television(500, 6);

        gestor.addElectrodomestico(lavadora1);
        gestor.addElectrodomestico(lavadora2);
        gestor.addElectrodomestico(lavadora3);
        gestor.addElectrodomestico(lavadora4);
        gestor.addElectrodomestico(lavadora5);

        gestor.addElectrodomestico(television1);
        gestor.addElectrodomestico(television2);
        gestor.addElectrodomestico(television3);
        gestor.addElectrodomestico(television4);
        gestor.addElectrodomestico(television5);

        gestor.mostrar();
    }
}
