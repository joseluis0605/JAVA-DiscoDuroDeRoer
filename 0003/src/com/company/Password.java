package com.company;

public class Password {

    private String password;
    private int longitud;

    public Password (){
        this ("12345678");
    }

    public Password (String password){
        this.longitud = password.length();
        this.password= password;
    }

    public Password (int longitud, String password){
        this.longitud= longitud;
        this.password= password;
    }

    public String toString(){
        return this.password+": "+this.longitud;
    }


    public boolean esFuerte (){
        int numMayus=0;
        int minusculas=0;
        int numeros=0;

        for (int i=0; i<password.length();i++){
            int valor= password.charAt(i);

            if (esNumero(valor)){
                numeros++;
            }
            if (esMayuscula(valor)){
                numMayus++;
            }
            if (esMinuscula(valor)){
                minusculas++;
            }
        }

        if (numMayus>2 && minusculas>1 && numeros>5){
            return true;
        }else {
            return false;
        }
    }

    private boolean esNumero(int valor){
        return 48<=valor && valor<=57;
    }
    private boolean esMayuscula(int valor){
        return 97<=valor && valor<=122;
    }
    private boolean esMinuscula (int valor){
        return 65<=valor && valor<=90;
    }


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
