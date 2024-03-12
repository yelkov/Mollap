package edu.badpals.intercepting.targets;

public class Vehicle implements Target{
    public Vehicle(){};

    @Override
    public void execucio(String nombre) {
        System.out.println("Puerta abierta "+nombre.toString()+"!");
    }
}
