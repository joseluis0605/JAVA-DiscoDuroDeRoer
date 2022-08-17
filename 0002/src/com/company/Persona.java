package com.company;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double altura;
    private int peso;

    public Persona (){
        this("", -1,"",'M',-1,-1);
    }
    public Persona(String nombre, int edad, char sexo){
        this(nombre, edad, "",sexo, -1,-1);
    }

    public Persona (String nombre, int edad, String dni, char sexo, double altura, int peso){
        char letra = sexoIntroducido(sexo);
        this.nombre=nombre;
        this.edad= edad;
        this.dni= dni;
        this.sexo= letra;
        this.altura= altura;
        this.peso= peso;
    }

    public int calcularIMC (){

        double valor= (peso)/altura*altura/100;

        if (valor<20){
            return -1;
        }else  if (valor>=20 && valor<25){
            return 0;
        }else {
            return 1;
        }
    }

    public boolean esMayorEdad (){
        return this.edad>=18;
    }

    public char sexoIntroducido(char letra){
        if (letra=='M' ||letra=='H'){
            return letra;
        }else {
            return 'M';
        }
    }

    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + dni + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
