package edu.badpals.intercepting.filtres;

public class Autenticacio implements Filtre{
    public Autenticacio(){

    }

    @Override
    public void execucio(String nombre) {
        System.out.println("Autenticación OK para " + nombre.toString());
    }
}
