package edu.badpals.intercepting.filtres;

public class Autoritzacio implements Filtre{
    @Override
    public void execucio(String nombre) {
        System.out.println("Autorizacion OK para "+ nombre.toString());
    }
}
