package com.company;

public class Alumno extends Persona{

    private double nota;
    private boolean esta;

    public Alumno(String nombre, int edad, String sexo, double nota, boolean esta) {
        super(nombre, edad, sexo);
        this.nota= nota;
        this.esta=esta;
    }

    public String toString(){
        return super.toString()+nota;
    }

    public boolean vaClase() {
        return esta;
    }
}
