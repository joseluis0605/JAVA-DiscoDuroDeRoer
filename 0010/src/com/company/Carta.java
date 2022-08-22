package com.company;

public abstract class Carta {

    private int numero;
    private String palo;
    private boolean sacado;

    public Carta(int numero, String palo){
        this.numero=numero;
        this.palo=palo;
        this.sacado=false;
    }

    public String toString(){
        return this.numero+" de "+palo;
    }

    public boolean esCarta(Carta carta) {
        return this.numero== carta.numero && this.palo.equals(carta.palo);
    }

}
