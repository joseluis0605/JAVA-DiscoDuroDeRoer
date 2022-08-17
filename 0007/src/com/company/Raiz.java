package com.company;

public class Raiz {

    private int a;
    private int b;
    private int c;

    public Raiz(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public static void imprimirRaiz(int a, int b, int c){

        double valorRaiz= b*b-4*a*c;
        valorRaiz= Math.sqrt(valorRaiz);

        if (valorRaiz>0){
            double primeraSol= (-b+valorRaiz)/(2*a);
            double segundaSol= (-b-valorRaiz)/(2*a);
            if (primeraSol==segundaSol){
                System.out.println("x1= "+primeraSol);
            }else {
                System.out.println("x1= "+primeraSol);
                System.out.println("x2= "+segundaSol);
            }

        }else {
            System.out.println("no hay solucion real");
        }
    }

    public static int discriminante(int a, int b, int c){
        return (int) Math.sqrt(b*b-4*a*c);
    }

    public static boolean tieneRaices(int a, int b, int c){
        double valorRaiz= b*b-4*a*c;
        valorRaiz= Math.sqrt(valorRaiz);

        if (valorRaiz>0){
            double primeraSol= (-b+valorRaiz)/(2*a);
            double segundaSol= (-b-valorRaiz)/(2*a);
            if (primeraSol != segundaSol){
                return true;
            }
        }
        return false;
    }

    public static boolean tieneRaiz(int a, int b, int c){
        double valorRaiz= b*b-4*a*c;
        valorRaiz= Math.sqrt(valorRaiz);

        if (valorRaiz>0){
            double primeraSol= (-b+valorRaiz)/(2*a);
            double segundaSol= (-b-valorRaiz)/(2*a);
            if (primeraSol==segundaSol){
                return true;
            }
        }
        return false;
    }
}
