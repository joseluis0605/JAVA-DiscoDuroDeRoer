package com.company;

public class Main {

    public static void main(String[] args) {

        Profesor profesor1= new Profesor("profesor1", 40, "hombre", Materia.MATEMATICAS);

        Aula aula= new Aula(1, profesor1,  Materia.MATEMATICAS);

        Alumno alumno1 = new Alumno("alumno1", 18, "hombre", 5.0, true);
        Alumno alumno2 = new Alumno("alumno2", 19, "hombre", 9.0, true);
        Alumno alumno3 = new Alumno("alumno3", 19, "mujer", 8.0, false);
        Alumno alumno4 = new Alumno("alumno4", 20, "hombre", 3.0, true);
        Alumno alumno5 = new Alumno("alumno5", 17, "mujer", 7.0, false);
        Alumno alumno6 = new Alumno("alumno6", 16, "hombre", 10.0, true);

        aula.addAlumno(alumno1);
        aula.addAlumno(alumno2);
        aula.addAlumno(alumno3);
        aula.addAlumno(alumno4);
        aula.addAlumno(alumno5);
        aula.addAlumno(alumno6);

        //aula.mostrarClase();

        aula.hayClase();
    }
}
