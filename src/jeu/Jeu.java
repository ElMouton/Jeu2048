package jeu;

public class Jeu extends SujetObserve{
    private int size;
    private int objectif;

    public Jeu() {
        this.size = 4;
    }

    public void jouer(int l, int c){

    }

    public int size() {
        return size;
    }

    public int getCase(int l, int c){
        return 0;
    }

    public int getNbGagnees(){
        return 0;
    }

    public int getNbJouees(){
        return 0;
    }

    public void setTaille(int taille){
        this.size = taille;
    }

    public void setObjectif(int objectif){
        this.objectif = objectif;
    }
}
