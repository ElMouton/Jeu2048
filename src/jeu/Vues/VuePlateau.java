package jeu.Vues;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import jeu.Ecouteur.EcouteurCase;
import jeu.Jeu;
import jeu.Observateur;

import java.util.ArrayList;

public class VuePlateau extends GridPane implements Observateur {
    private Jeu jeu;
    private ArrayList<Button> cases;

    public VuePlateau(Jeu jeu) {
        this.jeu = jeu;
        this.cases = new ArrayList<>();
        this.setBackground(new Background(new BackgroundFill(Color.valueOf("#72F27A"), null, null)));

        int sizeXButton = 100;
        int sizeYButton = 70;

        this.setPadding(new Insets(20));
        double sizeX = (1000 - (sizeXButton * this.jeu.size()) - (this.getPadding().getTop() * 2)) / (this.jeu.size() - 1);
        double sizeY = (500 - (sizeYButton * this.jeu.size()) - (this.getPadding().getTop() * 2)) / (this.jeu.size() - 1);

        this.setHgap(sizeX);
        this.setVgap(sizeY);

        for (int lig = 0; lig < this.jeu.size(); lig++) {
            for (int col = 0; col < this.jeu.size(); col++) {
                Button button = new Button(jeu.getCase(lig, col) + "");
                button.setMinSize(sizeXButton, sizeYButton);
                button.setBackground(new Background(new BackgroundFill(Color.valueOf("#5CDBC0"), null, null)));

                Font font = Font.loadFont(this.getClass().getResourceAsStream("/TheRumor.ttf"), 20);
                button.setFont(font);

                this.add(button, lig, col);
                cases.add(button);

                button.setOnAction(new EcouteurCase(col, lig, this.jeu));
            }
        }
        jeu.ajouterObservateur(this);
    }

    @Override
    public void reagir() {
    }
}
