package jeu.Ecouteur;

import javafx.event.Event;
import javafx.event.EventHandler;
import jeu.Jeu;

public class EcouteurNouveau implements EventHandler {
    Jeu jeu;

    public EcouteurNouveau(Jeu jeu) {
        this.jeu = jeu;
    }
    @Override
    public void handle(Event event) {
        this.jeu.nouveau();
    }
}
