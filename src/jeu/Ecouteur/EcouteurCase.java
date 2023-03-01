package jeu.Ecouteur;

import javafx.event.Event;
import javafx.event.EventHandler;
import jeu.Jeu;

public class EcouteurCase implements EventHandler {
    private int lig;
    private int col;
    private Jeu jeu;

    public EcouteurCase(int col, int lig, Jeu jeu) {
        this.col = col;
        this.lig = lig;
        this.jeu = jeu;
    }

    @Override
    public void handle(Event event) {
        int chiffreAct = this.jeu.getCase(this.lig, this.col);
        int haut = -1, bas = -1, gauche = -1, droite = -1;

        if (this.lig != 0) gauche = this.jeu.getCase(this.lig - 1, this.col);
        if (this.lig != this.jeu.size() - 1) droite = this.jeu.getCase(this.lig + 1, this.col);

        if (this.col != 0) haut = this.jeu.getCase(this.lig, this.col - 1);
        if (this.col != this.jeu.size() - 1) bas = this.jeu.getCase(this.lig, this.col + 1);

        boolean find = false;
        if (chiffreAct == haut) {
            find = true;
            this.jeu.nouveauNombre(this.lig, this.col - 1);
        }
        if (chiffreAct == bas) {
            find = true;
            this.jeu.nouveauNombre(this.lig, this.col + 1);
        }
        if (chiffreAct == gauche) {
            find = true;
            this.jeu.nouveauNombre(this.lig - 1, this.col);
        }
        if (chiffreAct == droite) {
            find = true;
            this.jeu.nouveauNombre(this.lig + 1, this.col);
        }

        if (find) {
            this.jeu.doublement(this.lig, this.col);
        }
    }
}
