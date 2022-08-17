package com.company;

public class Gestor {

    private int nSeries;
    private Serie listaSerie[];

    private int nVideojuego;
    private Videojuego listaVideojuegos[];

    public Gestor(){
        this.nSeries=0;
        this.nVideojuego=0;
        this.listaSerie= new Serie[5];
        this.listaVideojuegos= new Videojuego[5];
    }

    public void addSerie(Serie serie){
        if (nSeries< listaSerie.length){
            listaSerie[nSeries]= serie;
            nSeries++;
        }
    }

    public void addVideogame(Videojuego serie){
        if (nVideojuego< listaVideojuegos.length){
            listaVideojuegos[nVideojuego]= serie;
            nVideojuego++;
        }
    }

    public void entregarVideogame( Videojuego videojuego){
        for (int i=0;i<nVideojuego;i++){
            if (videojuego.compareTo(listaVideojuegos[i])){
                listaVideojuegos[i].entregar();
            }
        }
    }

    public void entregarSerie( Serie serie){
        for (int i=0;i<nVideojuego;i++){
            if (serie.compareTo(listaSerie[i])){
                listaSerie[i].entregar();
            }
        }
    }

    public void mostrarVideogamesEntregados(){
        int contador=0;
        System.out.println("LISTA DE VIDEOJUEGOS ENTREGADOS");
        for (int i=0;i<nVideojuego;i++){
            if (listaVideojuegos[i].isEntregado()){
                System.out.println("***********************");
                System.out.println(listaVideojuegos[i]);
                contador++;
            }
        }
        System.out.println("hay un total de: "+contador);
    }

    public void mostrarSeriesEntregados(){
        int contador=0;
        System.out.println("LISTA DE SERIES ENTREGADAS");
        for (int i=0;i<nSeries;i++){
            if (listaSerie[i].isEntregado()){
                System.out.println("***********************");
                System.out.println(listaSerie[i]);
                contador++;
            }
        }
        System.out.println("hay un total de "+contador);
    }

    public void mostrarMasHorasVideojuego(){
        int index=0;
        for (int i=0;i<nVideojuego;i++){
            if (listaVideojuegos[i].esMayor(listaVideojuegos[index])){
                index= i;
            }
        }

        System.out.println(listaVideojuegos[index]);
    }

    public void mostrarTemporadasSeries(){
        int index=0;
        for (int i=0;i<nSeries;i++){
            if (listaSerie[i].esMayor(listaSerie[index])){
                index= i;
            }
        }
        System.out.println(listaSerie[index]);
    }
}
