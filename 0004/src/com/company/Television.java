package com.company;

public class Television extends Electrodomestico{

    private int pulgadas;
    private boolean TDT;

    public Television(){
        super(100,"BLANCO", "F", 5);
        this.pulgadas= 20;
        this.TDT=false;
    }

    public Television(int precio, int peso){
        super(precio, "BLANCO", "F", peso);
        this.pulgadas= 20;
        this.TDT= false;
    }

    public Television(int precio, String color, String consumoEnergetico, int peso, int pulgadas, boolean TDT){
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas= pulgadas;
        this.TDT= TDT;
        comprobarMas40();
        comprobarTDT();
    }

    private void comprobarTDT() {
        if (this.TDT){
            setPrecio(getPrecio()+50);
        }
    }

    private void comprobarMas40() {
        int valor= getPrecio();
        if (pulgadas>=40){
            valor= valor*130/100;
        }
        setPrecio(valor);
    }

    public String toString(){
        return "soy una TELEVISION y tengo pulgadas: "+pulgadas+" TDT: "+TDT+" "+super.toString();
    }

    protected int getPulgadas() {
        return pulgadas;
    }
    protected boolean isTDT() {
        return TDT;
    }
}
