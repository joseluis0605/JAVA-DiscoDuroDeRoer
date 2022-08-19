package com.company;

public class Profesor extends Persona{

    private Materia materia;

    public Profesor(String nombre, int edad, String sexo, Materia materia) {
        super(nombre, edad, sexo);
        this.materia= materia;
    }

    public String toString(){
        return super.toString()+materia;
    }

    public boolean esAsignatura(Materia materia) {
        return this.materia.equals(materia);
    }
}
