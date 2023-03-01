package jeu.Ecouteur;

import javafx.event.Event;
import javafx.event.EventHandler;
import jeu.Jeu;

public class EcouteurCase implements EventHandler {
    private int lig;
    private int col;
    private Jeu jeu;

    public EcouteurCase(int i, int j, Jeu jeu) {
        this.col = i;
        this.lig = j;
        this.jeu = jeu;
    }

    @Override
    public void handle(Event event) {
        int chiffreAct = this.jeu.getCase(this.col, this.lig);
        int haut = -1, bas = -1, gauche = -1, droite = -1;

        if(this.col != 0) gauche = this.jeu.getCase(this.col - 1, this.lig);
        if(this.col != this.jeu.size()-1) droite = this.jeu.getCase(this.col + 1, this.lig);

        if(this.lig != 0) haut = this.jeu.getCase(this.col, this.lig - 1);
        if(this.lig != this.jeu.size()-1) bas = this.jeu.getCase(this.col, this.lig + 1);

        System.out.println("chiffreAct = " + chiffreAct);

        boolean find = false;
        if(chiffreAct == haut){
            find = true;
            System.out.println("oui haut");
        }
        if(chiffreAct == bas){
            find = true;
            System.out.println("oui bas");
        }
        if(chiffreAct == gauche){
            find = true;
            System.out.println("oui gauche");
        }
        if (chiffreAct == droite) {
            find = true;
            System.out.println("oui droite");
        }
        if(!find){
            System.out.println("non");
        }
        System.out.println("--------------");
    }
}
