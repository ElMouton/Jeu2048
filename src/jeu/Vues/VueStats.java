package jeu.Vues;

import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import jeu.Jeu;
import jeu.Observateur.Observateur;


public class VueStats extends Pane implements Observateur {
    private Jeu jeu;
    private Label stats;

    public VueStats(Jeu jeu) {
        this.jeu = jeu;

        this.setBackground(new Background(new BackgroundFill(Color.valueOf("#72F27A"), null, null)));

        this.stats = new Label("Nombre de parties jouees / Nombre de parties gagnees : " + jeu.getNbJouees() + " / " + jeu.getNbGagnees());
        Font font = Font.loadFont(this.getClass().getResourceAsStream("/TheRumor.ttf"), 30);
        this.stats.setFont(font);

        this.getChildren().add(stats);

        jeu.ajouterObservateur(this);
    }

    @Override
    public void reagir() {
        this.stats.setText("Nombre de parties jouees / Nombre de parties gagnees : " + jeu.getNbJouees() + " / " + jeu.getNbGagnees());
    }
}
