package com.company;

public interface Entregable {

    public void entregar();

    public void devolver();

    public boolean isEntregado();

    public boolean compareTo(Object o);

    boolean esMayor(Object o);
}
