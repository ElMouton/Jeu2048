package jeu;

public class Jeu extends SujetObserve{
    private int size;

    public Jeu() {
        this.size = 4;
    }

    public int size() {
        return size;
    }
}
