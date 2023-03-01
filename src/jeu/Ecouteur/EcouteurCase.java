package jeu.Ecouteur;

import javafx.event.Event;
import javafx.event.EventHandler;
import jeu.Jeu;

public class EcouteurCase implements EventHandler {
    private int lig;
    private int col;
    private Jeu jeu;

    public EcouteurCase(int lig, int col, Jeu jeu) {
        this.col = col;
        this.lig = lig;
        this.jeu = jeu;
    }

    @Override
    public void handle(Event event) {
        int chiffreAct = this.jeu.getCase(this.lig, this.col);
        int haut = -1, bas = -1, gauche = -1, droite = -1;

        if (this.col != 0) gauche = this.jeu.getCase(this.lig, this.col - 1);
        if (this.col != this.jeu.size() - 1) droite = this.jeu.getCase(this.lig, this.col + 1);

        if (this.lig != 0) haut = this.jeu.getCase(this.lig - 1, this.col);
        if (this.lig != this.jeu.size() - 1) bas = this.jeu.getCase(this.lig + 1, this.col);

        System.out.println("lig = " + lig + " col = " + col + " chiffreAct = " + chiffreAct);
        System.out.println("haut = " + haut + " bas = " + bas + " gauche = " + gauche + " droite = " + droite);

        boolean find = false;
        if (chiffreAct == haut) {
            find = true;
            System.out.println("oui haut");
        }
        if (chiffreAct == bas) {
            find = true;
            System.out.println("oui bas");
        }
        if (chiffreAct == gauche) {
            find = true;
            System.out.println("oui gauche");
        }
        if (chiffreAct == droite) {
            find = true;
            System.out.println("oui droite");
        }

        if (!find) {
            System.out.println("non");
        }
    }
}
