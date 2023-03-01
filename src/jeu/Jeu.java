package jeu;

import java.util.ArrayList;
import java.util.Random;

public class Jeu extends SujetObserve {
    private int size;
    private int objectif;
    private ArrayList<Integer> nombre;

    public Jeu() {
        this.size = 4;
        this.nombre = new ArrayList<>(this.size * this.size);

        for (int i = 0; i < this.size * this.size; i++) {
            Random r = new Random();
            int nb = (int) Math.pow(2, r.nextInt(8) + 1);

            this.nombre.add(nb);
        }
    }

    public void nouveau() {
        this.size = 4;

    }

    public void jouer(int l, int c) {

    }

    public int size() {
        return size;
    }

    public int getCase(int l, int c) {
        return this.nombre.get(l + c * this.size());
    }

    public int getNbGagnees() {
        return 0;
    }

    public int getNbJouees() {
        return 0;
    }

    public void setTaille(int taille) {
        this.size = taille;
    }

    public void setObjectif(int objectif) {
        this.objectif = objectif;
    }

    public void nouveauNombre(int l, int c) {
        Random r = new Random();
        int nb = (int) Math.pow(2, r.nextInt(3) + 1);

        this.nombre.set(c + l * this.size(), nb);
    }
}
