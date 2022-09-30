package com.company;

import java.util.Objects;

public class Vuelo {

    private String origen;
    private String destino;

    public Vuelo(String origen, String destino){
        this.origen=origen;
        this.destino= destino;
    }

    public String toString(){
        return this.origen+"--->"+this.destino;
    }

    public String getDestino() {
        return destino;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return origen.equals(vuelo.origen) && destino.equals(vuelo.destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origen, destino);
    }

    public String getOrigen() {
        return origen;
    }
}
