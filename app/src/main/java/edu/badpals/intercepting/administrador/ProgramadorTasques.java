package edu.badpals.intercepting.administrador;

import edu.badpals.intercepting.filtres.Filtre;
import edu.badpals.intercepting.targets.Target;

public class ProgramadorTasques {
    private Target target;
    private Tasques tasques = new Tasques();

    public ProgramadorTasques(Target target){
        this.tasques.setTarget(target);
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
