package jeu.Vues;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import jeu.Ecouteur.EcouteurCase;
import jeu.Jeu;
import jeu.Observateur;

import java.util.ArrayList;
import java.util.Random;

public class VuePlateau extends GridPane implements Observateur {
    private Jeu jeu;
    private ArrayList<Button> cases;

    public VuePlateau(Jeu jeu) {
        this.jeu = jeu;
        this.cases = new ArrayList<>();

        int sizeXButton = 100;
        int sizeYButton = 70;

        this.setPadding(new Insets(20));
        double sizeX = (1000 - (sizeXButton * this.jeu.size()) - (this.getPadding().getTop() * 2)) / (this.jeu.size() - 1);
        double sizeY = (500 - (sizeYButton * this.jeu.size()) - (this.getPadding().getTop() * 2)) / (this.jeu.size() - 1);

        this.setHgap(sizeX);
        this.setVgap(sizeY);

        for (int i = 0; i < this.jeu.size(); i++) {
            for (int j = 0; j < this.jeu.size(); j++) {
                Random r = new Random();

                int nb = (int) Math.pow(2, r.nextInt(1, 12));

                Button button = new Button("" + nb);
                button.setMinSize(sizeXButton, sizeYButton);
                button.setFont(Font.loadFont(getClass().getResourceAsStream("/TheRumor.ttf"), 20));

                this.add(button, i, j);
                cases.add(button);

                button.setOnAction(new EcouteurCase(i, j));
            }
        }

        jeu.ajouterObservateur(this);
    }

    @Override
    public void reagir() {

    }
}
