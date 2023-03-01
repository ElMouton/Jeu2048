package jeu.Ecouteur;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextInputDialog;
import jeu.Jeu;

import java.util.Optional;

public class EcouteurTaille implements EventHandler {
    Jeu jeu;
    public EcouteurTaille(Jeu jeu) {
        this.jeu = jeu;
    }

    @Override
    public void handle(Event event) {
        TextInputDialog inputTaille = new TextInputDialog("Choix de la taille");

        inputTaille.setTitle("Taille");
        inputTaille.setHeaderText("Entrez la taille :");
        inputTaille.setContentText("Taille :");

        Optional<String> result = inputTaille.showAndWait();
        result.ifPresent(taille -> jeu.setTaille(Integer.parseInt(taille)));
    }
}
