package com.company;

import javax.swing.tree.AbstractLayoutCache;

public abstract class Electrodomestico {

    //Los constructores que se implementaran serán
    //Un constructor por defecto.
    //Un constructor con el precio y peso. El resto por defecto.
    //Un constructor con todos los atributos.

    private int precio;
    private String color;
    private String consumoEnergetico;
    private int peso;

    public Electrodomestico(){
        this(100,"BLANCO", "F", 5);
    }

    public Electrodomestico(int precio, int peso){
        this(precio, "BLANCO", "F", peso);
    }

    public Electrodomestico(int precio, String color, String consumoEnergetico, int peso){
        this.precio= precio;
        if (colorCorrecto(color)){
            this.color= color;
        }else {
            this.color= "BLANCO";
        }
        if (letraCorrecta(consumoEnergetico)){
            this.consumoEnergetico= consumoEnergetico;
        }else {
            this.consumoEnergetico= "F";
        }

        this.peso= peso;
    }

    private boolean colorCorrecto(String color) {
        return color.equals("gris") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("blanco");
    }

    private boolean letraCorrecta(String consumoEnergetico) {
        return consumoEnergetico.equals("A") || consumoEnergetico.equals("B") || consumoEnergetico.equals("C") || consumoEnergetico.equals("D") || consumoEnergetico.equals("E") || consumoEnergetico.equals("F");
    }

    //precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios
    public void precioFinal(){
        switch (consumoEnergetico){
            case "A": precio= precio+100; break;
            case "B": precio= precio+80; break;
            case "C": precio= precio+60; break;
            case "D": precio= precio+50; break;
            case "E": precio= precio+30; break;
            case "F": precio= precio+10; break;
        }

        if (peso<=19){
            precio= precio+10;
        }else if (20<=peso && peso<=49){
            precio= precio+50;
        }else if (peso>49 && peso<=79){
            precio= precio+80;
        }else {
            precio= precio+100;
        }
    }

    public String toString(){
        return "precio: "+precio+" consumo: "+consumoEnergetico;
    }


    //getter and setter
    protected int getPrecio() {
        return precio;
    }
    protected void setPrecio(int precio) {
        this.precio = precio;
    }

    protected String getColor() {
        return color;
    }
    protected void setColor(String color) {
        this.color = color;
    }

    protected String getConsumoEnergetico() {
        return consumoEnergetico;
    }
    protected void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    protected int getPeso() {
        return peso;
    }
    protected void setPeso(int peso) {
        this.peso = peso;
    }
}
