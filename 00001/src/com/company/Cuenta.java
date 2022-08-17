package com.company;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String nombre){
        this(nombre,0);
    }
    public Cuenta(String nombre,double cantidad){
        this.titular= nombre;
        this.cantidad= cantidad;
    }

    @Override
    public String toString() {
        return this.titular+": "+this.cantidad+"€";
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresarCantidad (double cantidad){
        if (cantidad>0){
            this.cantidad= this.cantidad + cantidad;
        }
    }

    public void retirarCantidad (double cantidad){
        this.cantidad= this.cantidad - cantidad;
        if (this.cantidad<0){
            this.cantidad=0;
        }
    }
}
