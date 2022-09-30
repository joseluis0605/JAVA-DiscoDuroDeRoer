package com.company;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    private List<String> almacen;

    public Ejercicio1(){
        this.almacen= new ArrayList<>();
    }

    public void addElemento(String palabra){
        almacen.add(palabra);
    }

    public void borrar(String palabra){
        this.almacen.remove(palabra);
    }

    public void mostrarFor(){
        for (int i=0;i<almacen.size();i++){
            String cadena= almacen.get(i);
            System.out.println(cadena);
        }
    }

    public void mostrarForMejorado(){
        for (String palabra: almacen){
            System.out.println(palabra);
        }
    }
}
