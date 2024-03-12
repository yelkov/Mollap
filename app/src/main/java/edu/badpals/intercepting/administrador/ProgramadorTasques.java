package edu.badpals.intercepting.administrador;

import edu.badpals.intercepting.filtres.Filtre;
import edu.badpals.intercepting.targets.Target;

public class ProgramadorTasques {
    private Tasques tasques;
    private Target target;

    public ProgramadorTasques(Target target){
        this.target = target;
    }
    public Tasques getTasques(){
        return this.tasques;
    }
    public void setTasca(Filtre filtre){
        tasques.afegirTasca(filtre);
    }
    public void executarTasques(String mensaje){
        tasques.execucio(mensaje);
    }
}
