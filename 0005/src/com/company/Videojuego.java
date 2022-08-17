package com.company;

public class Videojuego implements  Entregable{

    //Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
    private String titulo;
    private int horas;
    private boolean entregado;
    private String genero;
    private String company;

    //Un constructor por defecto.
    //Un constructor con el titulo y horas estimadas. El resto por defecto.
    //Un constructor con todos los atributos, excepto de entregado.

    public Videojuego(){
        this("", 10,"", "");
    }

    public Videojuego(String titulo, int horas){
        this(titulo, horas, "", "");
    }

    public Videojuego(String titulo, int horas, String genero, String company){
        this.titulo= titulo;
        this.horas= horas;
        this.genero= genero;
        this.company= company;
        this.entregado= false;
    }

    //metodo toString
    public String toString(){
        return "titulo:"+titulo+" numero horas: "+horas+" genero y compañia: "+genero+" "+company+" entregado: "+entregado;

    }

    //getter and setter
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public void entregar() {
        this.entregado=true;
    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public boolean compareTo(Object o) {
        Videojuego videojuego= (Videojuego) o;
        int hora= videojuego.getHoras();
        if (hora==this.horas){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean esMayor(Object videojuego) {
        Videojuego videojuego1= (Videojuego) videojuego;
        return videojuego1.horas<this.horas;
    }
}
