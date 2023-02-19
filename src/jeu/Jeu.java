package jeu;

public class Jeu extends SujetObserve{
    private int taille;

    public Jeu(){
        this.taille = 4;
    }

    public int getTaille() {
        return taille;
    }
}
