package jeu.Vues;

import javafx.scene.layout.Pane;
import jeu.Jeu;
import jeu.Observateur;

public class VueStats extends Pane implements Observateur {
    private Jeu jeu;

    public VueStats(Jeu jeu) {
        this.jeu = jeu;
    }

    @Override
    public void reagir() {

    }
}
