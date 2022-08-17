package com.company;

public class Serie implements Entregable{

    //titulo, numero de temporadas, entregado, genero y creador.
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    //Un constructor por defecto.
    //Un constructor con el titulo y horas estimadas. El resto por defecto.
    //Un constructor con todos los atributos, excepto de entregado.

    public Serie(){
        this("", 3, "", "");
    }

    public Serie(String titulo, String creador){
        this(titulo, 3, "", creador);
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador){
        this.titulo= titulo;
        this.numeroTemporadas= numeroTemporadas;
        this.genero= genero;
        this.creador= creador;
        this.entregado= false;
    }

    //toString
    public String toString(){
        return "titulo:"+titulo+" numero temporadas: "+numeroTemporadas+" genero y creador: "+genero+" "+creador+" entregado: "+entregado;
    }



    //getter and setter

    protected String getGenero() {
        return genero;
    }
    protected void setGenero(String genero) {
        this.genero = genero;
    }

    protected String getCreador() {
        return creador;
    }
    protected void setCreador(String creador) {
        this.creador = creador;
    }

    protected String getTitulo() {
        return titulo;
    }
    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    protected int getNumeroTemporadas() {
        return numeroTemporadas;
    }
    protected void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public void entregar() {
        this.entregado= true;
    }

    @Override
    public void devolver() {
        this.entregado= false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }


    public boolean compareTo(Object o) {
        Serie serie= (Serie) o;
        int temporada= serie.getNumeroTemporadas();
        if (temporada==this.numeroTemporadas){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean esMayor(Object serie) {
        Serie serie1= (Serie) serie;
        return this.numeroTemporadas> serie1.numeroTemporadas;
    }
}
