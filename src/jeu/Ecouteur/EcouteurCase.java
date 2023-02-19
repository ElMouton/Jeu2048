package jeu.Ecouteur;

import javafx.event.Event;
import javafx.event.EventHandler;

public class EcouteurCase implements EventHandler {
    private int lig;
    private int col;

    public EcouteurCase(int i, int j) {
        this.col = i;
        this.lig = j;
    }

    @Override
    public void handle(Event event) {
        System.out.println("lig : " + (this.lig+1) + " col : " + (this.col+1));
    }
}
