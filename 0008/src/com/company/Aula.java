package com.company;

import java.util.IllegalFormatCodePointException;

public class Aula {

    public int id;
    public Profesor profesor;
    public Alumno alumno[];
    public int numeroAlumnos;
    public Materia materia;

    public Aula(int id, Profesor profesor, Materia materia){
        this.id=id;
        if (profesor.esAsignatura(materia)){
            this.profesor= profesor;
        }
        else {
            System.out.println("ESE PROFESOR NO ES DE ESA ASIGNATURA, ASIGNA UNA...");
        }

        this.materia= materia;
        this.alumno= new Alumno[10];
        this.numeroAlumnos=0;
    }

    public void addAlumno(Alumno alumnos){
        if (numeroAlumnos<alumno.length){
            alumno[numeroAlumnos]= alumnos;
            numeroAlumnos++;
        }
    }

    public void mostrarClase(){
        System.out.println("*******************************");

        if (profesor!=null){
            System.out.println("PROFESOR DE: ");
            System.out.println(profesor);
        }

        System.out.println("CLASE DE: "+this.materia);
        for (int i=0;i<numeroAlumnos;i++){
            System.out.println(alumno[i]);
        }
    }

    public void hayClase() {
        double porcentajeEstudiantil=0;
        for (int i=0;i<numeroAlumnos;i++){
            if (alumno[i].vaClase()){
                porcentajeEstudiantil++;
            }
        }
        porcentajeEstudiantil= porcentajeEstudiantil*100/numeroAlumnos;

        double porcentaje=  Math.random();
        if (porcentaje<0.20){
            System.out.println("NO HAY CLASE "+porcentaje);
        }else{
            if (porcentajeEstudiantil<50){
                System.out.println("NO HAY CLASE");
            }else {
                System.out.println("HAY CLASE");
            }
        }
    }
}
