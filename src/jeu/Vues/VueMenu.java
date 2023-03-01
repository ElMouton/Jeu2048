package jeu.Vues;

import javafx.application.Platform;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import jeu.Jeu;
import jeu.Observateur.Observateur;

public class VueMenu extends MenuBar implements Observateur {
    private Jeu jeu;

    public VueMenu(Jeu jeu) {
        this.jeu = jeu;
        Menu menu = new Menu("Jeu");

        MenuItem nouveau = new MenuItem("Nouveau");
        nouveau.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
        nouveau.setOnAction(actionEvent -> jeu.nouveau());

        MenuItem quitter = new MenuItem("Quitter");
        quitter.setAccelerator(KeyCombination.keyCombination("Ctrl+Q"));
        quitter.setOnAction(actionEvent -> Platform.exit());

        MenuItem taille = new MenuItem("Taille");

        MenuItem objectif = new MenuItem("Objectif");

        menu.getItems().addAll(nouveau, quitter, taille);
        this.getMenus().add(menu);
    }

    @Override
    public void reagir() {

    }
}
