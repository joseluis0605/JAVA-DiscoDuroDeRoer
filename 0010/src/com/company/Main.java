package com.company;

import com.company.cartas.Basto;
import com.company.cartas.Espada;
import com.company.cartas.Oro;

public class Main {

    public static void main(String[] args) {

        Baraja baraja= new Baraja();

        //baraja.mostrarSiguiente(new Basto(12));

        baraja.sacarCartas(46);
        baraja.dameCarta(new Basto(10));
        baraja.mostrar();

    }
}
