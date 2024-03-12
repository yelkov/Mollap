package edu.badpals.intercepting.clients;

import edu.badpals.intercepting.administrador.ProgramadorTasques;

public interface Client {
    public void setProgramadorTasques(ProgramadorTasques tasca);
    public void enviarPeticio(String mensaje);
}
