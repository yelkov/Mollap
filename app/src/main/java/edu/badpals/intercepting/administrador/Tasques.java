package edu.badpals.intercepting.administrador;

import edu.badpals.intercepting.filtres.Filtre;
import edu.badpals.intercepting.targets.Target;

import java.util.ArrayList;
import java.util.List;

public class Tasques {
    private Target target;
    private List<Filtre> tasques = new ArrayList<>();
    public Tasques(){};

    public List<Filtre> getTasques() {
        return this.tasques;
    }

    public Target getTarget() {
        return this.target;
    }
    public void afegirTasca(Filtre filtre){
        this.tasques.add(filtre);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
    public void execucio(String mensaje){
        for (Filtre filter: this.tasques ){
            filter.execucio(mensaje);
        }
    }
}
