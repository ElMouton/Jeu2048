package jeu;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.util.Random;

public class VuePlateau extends GridPane implements Observateur{
    private Jeu jeu;

    public VuePlateau(Jeu jeu) {
        this.jeu = jeu;

        int sizeXButton = 100;
        int sizeYButton = 70;

        this.setPadding(new Insets(20));
        double sizeX = (1000 - (sizeXButton * this.jeu.getTaille()) - (this.getPadding().getTop() * 2)) / (this.jeu.getTaille() - 1);
        double sizeY = (500 - (sizeYButton * this.jeu.getTaille()) - (this.getPadding().getTop() * 2)) / (this.jeu.getTaille() - 1);

        this.setHgap(sizeX);
        this.setVgap(sizeY);

        for (int i = 0; i < this.jeu.getTaille(); i++) {
            for (int j = 0; j < this.jeu.getTaille(); j++) {
                Random r = new Random();

                int nb = (int) Math.pow(2, r.nextInt(1, 12));

                Button button = new Button("" + nb);
                button.setMinSize(sizeXButton, sizeYButton);
                this.add(button, i, j);
            }
        }

        jeu.ajouterObservateur(this);
    }

    @Override
    public void reagir() {

    }
}
