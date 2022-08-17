package com.company;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String isbn, String titulo, String autor, int numeroPaginas){
        this.titulo= titulo;
        this.isbn= isbn;
        this.autor= autor;
        this.numeroPaginas=numeroPaginas;
    }

    public String toString(){
        return titulo+" "+isbn+" "+numeroPaginas+" paginas";
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void masPaginas(Libro libro2) {
        if (this.numeroPaginas> libro2.numeroPaginas){
            System.out.println("LIBRO 1 MAYOR");
        }else {
            System.out.println("LIBRO 2 MAYOR");
        }
    }
}
