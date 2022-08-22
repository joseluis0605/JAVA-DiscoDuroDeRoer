package com.company;

import com.company.cartas.Basto;
import com.company.cartas.Copa;
import com.company.cartas.Espada;
import com.company.cartas.Oro;

public class Baraja {

    private Carta baraja[];
    private int numeroCartas;

    public Baraja(){
        baraja= new Carta[48];
        this.numeroCartas=0;

        crearBaraja();
    }

    private void crearBaraja() {
        int contador=1;

        for (int i=0;i<12;i++){
            Oro oro= new Oro(contador);
            baraja[i]= oro;
            contador++;
        }

        contador=1;
        for (int i=12;i<24;i++){
            Copa oro= new Copa(contador);
            baraja[i]= oro;
            contador++;
        }

        contador=1;
        for (int i=24;i<36;i++){
            Espada oro= new Espada(contador);
            baraja[i]= oro;
            contador++;
        }

        contador=1;
        for (int i=36;i<48;i++){
            Basto oro= new Basto(contador);
            baraja[i]= oro;
            contador++;
        }
    }

    public void mostrar(){
        System.out.println("MOSTRAMOS BARAJA");
        for (int i=numeroCartas;i< baraja.length;i++){
            System.out.println(baraja[i]);
        }
    }

    public void barajar(){
        for (int i=0;i< 48;i++){
            int numero= (int) (Math.random()*100%48);
            Carta aux= baraja[i];
            baraja[i]= baraja[numero];
            baraja[numero]=aux;
        }
    }

    public void mostrarSiguiente (Carta carta){

        int encontrada=0;
        for (int i=0;i<48;i++){
            if (encontrada==1){
                if (baraja[i]!=null){
                    System.out.println(baraja[i]);
                    encontrada=0;
                }
            }

            if (baraja[i].esCarta(carta)){
                if (i==47){
                    System.out.println("BRO ES ULTIMA");
                }else {
                    encontrada=1;
                }

            }

        }
    }

    public void sacarCartas(int numeroCartas){
        this.numeroCartas=numeroCartas;
    }

    public void dameCarta(Carta carta){
        int encontrada=0;
        for (int i=numeroCartas;i< baraja.length;i++){
            if (baraja[i].esCarta(carta)){
                System.out.println("TOMA LA CARTA");
                System.out.println(baraja[i]);
                Carta carta1= baraja[i];
                baraja[i]=baraja[numeroCartas];
                baraja[numeroCartas]=carta1;
                numeroCartas++;
                encontrada=1;
            }
        }
        if (encontrada==0){
            System.out.println("NO ESTA BRO");
        }
    }
}
