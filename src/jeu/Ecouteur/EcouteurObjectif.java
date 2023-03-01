package jeu.Ecouteur;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextInputDialog;
import jeu.Jeu;

import java.util.Optional;

public class EcouteurObjectif implements EventHandler {
    Jeu jeu;

    public EcouteurObjectif(Jeu jeu) {
        this.jeu = jeu;
    }

    @Override
    public void handle(Event event) {
        TextInputDialog inputObjectif = new TextInputDialog("Choix de l'objectif");

        inputObjectif.setTitle("Objectif");
        inputObjectif.setHeaderText("Entrez l'objectif :");
        inputObjectif.setContentText("Objectif :");

        Optional<String> result = inputObjectif.showAndWait();
        result.ifPresent(objectif -> jeu.setObjectif(Integer.parseInt(objectif)));
    }
}
