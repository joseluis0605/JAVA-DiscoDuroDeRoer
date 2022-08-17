package com.company;

public class Lavadora extends Electrodomestico{

    private int carga;

    public Lavadora(){
        super(100,"BLANCO", "F", 5);
        this.carga= 5;
    }

    public Lavadora(int precio, int peso){
        super(precio, "BLANCO", "F", peso);
        this.carga= 5;
    }

    public Lavadora(int precio, String color, String consumoEnergetico, int peso, int carga){
        super(precio, color, consumoEnergetico, peso);
        this.carga= carga;
        comprobarCarga();
    }

    private void comprobarCarga(){
        if (carga>30){
            int valor= getPrecio();
            valor= valor+50;
            setPrecio(valor);
        }
    }

    protected int getCarga() {
        return carga;
    }

    public String toString(){
        return "soy una LAVADORA y tengo carga: "+carga+" "+super.toString();
    }

}
