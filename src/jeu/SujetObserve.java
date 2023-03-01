package jeu;

import java.util.ArrayList;

public class SujetObserve {
    private ArrayList<Observateur> obs;

    public SujetObserve() {
        this.obs = new ArrayList<>();
    }

    public void ajouterObservateur(Observateur obs) {
        this.obs.add(obs);
    }

    public void notifierObservateurs() {
        for (Observateur obs : this.obs) {
            obs.reagir();
        }
    }
}
