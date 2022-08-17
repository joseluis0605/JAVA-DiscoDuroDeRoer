package com.company;

public class Gestor {

    private Electrodomestico catalogo[];
    private int numeroElectrodomesticos;

    public Gestor(int max){
        this.numeroElectrodomesticos=0;
        this.catalogo= new  Electrodomestico[max];
    }

    public void addElectrodomestico(Electrodomestico electrodomestico){
        if (numeroElectrodomesticos<catalogo.length){
            catalogo[numeroElectrodomesticos]= electrodomestico;
            numeroElectrodomesticos++;
        }
    }

    public void mostrar(){
        for (int i=0;i<numeroElectrodomesticos;i++){
            System.out.println("***************************");
            System.out.println(catalogo[i]);
        }
    }
}
