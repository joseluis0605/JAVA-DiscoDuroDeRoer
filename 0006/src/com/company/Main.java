package com.company;

public class Main {

    public static void main(String[] args) {

        Libro libro1= new Libro("1", "titulo1", "autor1", 150);
        Libro libro2= new Libro("2", "titulo2", "autor2", 800);

        libro1.masPaginas(libro2);

        System.out.println(libro2);
    }
}
