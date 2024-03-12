package edu.badpals.intercepting.clients;

import edu.badpals.intercepting.administrador.ProgramadorTasques;

public class Mollapp implements Client{
    private ProgramadorTasques programadorTasques;
    public Mollapp(){};

    @Override
    public void setProgramadorTasques(ProgramadorTasques programadorTasques) {
        this.programadorTasques = programadorTasques;
    }

    @Override
    public void enviarPeticio(String mensaje) {
        this.programadorTasques.executarTasques(mensaje);
    }
}
