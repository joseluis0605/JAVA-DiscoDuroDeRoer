package com.company;

public class Main {

    public static void main(String[] args) {

        Gestor gestor= new Gestor();

        Serie serie1= new Serie("serie1", 5, "genero1", "creador1");
        Serie serie2= new Serie("serie2", 4, "genero2", "creador2");
        Serie serie3= new Serie("serie3", 8, "genero3", "creador3");
        Serie serie4= new Serie("serie4", 3, "genero4", "creador4");

        Videojuego videojuego1= new Videojuego("videojuego1", 20, "genero1", "company1");
        Videojuego videojuego2= new Videojuego("videojuego2", 50, "genero2", "company2");
        Videojuego videojuego3= new Videojuego("videojuego3", 30, "genero3", "company3");
        Videojuego videojuego4= new Videojuego("videojuego4", 10, "genero4", "company4");

        gestor.addSerie(serie1);
        gestor.addSerie(serie2);
        gestor.addSerie(serie3);
        gestor.addSerie(serie4);

        gestor.addVideogame(videojuego1);
        gestor.addVideogame(videojuego2);
        gestor.addVideogame(videojuego3);
        gestor.addVideogame(videojuego4);

        gestor.entregarVideogame(videojuego3);
        gestor.entregarVideogame(videojuego2);


        //gestor.mostrarVideogamesEntregados();

       // gestor.mostrarMasHorasVideojuego();

        gestor.mostrarTemporadasSeries();
    }
}
