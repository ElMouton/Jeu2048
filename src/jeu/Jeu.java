package jeu;

import jeu.Observateur.SujetObserve;

import java.util.ArrayList;
import java.util.Random;

public class Jeu extends SujetObserve {
    private int size;
    private int nbJouee;
    private int nbGagnee;
    private int objectif;
    private ArrayList<Integer> nombre;

    public Jeu() {
        this.nbJouee = 1;
        this.nbGagnee = 0;
        this.size = 4;
        this.nombre = new ArrayList<>(this.size * this.size);

        for (int i = 0; i < this.size * this.size; i++) {
            Random r = new Random();
            int nb = (int) Math.pow(2, r.nextInt(3) + 1);

            this.nombre.add(nb);
        }
    }

    public void nouveau() {
        this.nbJouee++;
        this.nombre = new ArrayList<>(this.size * this.size);

        for (int i = 0; i < this.size * this.size; i++) {
            Random r = new Random();
            int nb = (int) Math.pow(2, r.nextInt(3) + 1);

            this.nombre.add(nb);
        }
        this.notifierObservateurs();
    }

    public void jouer(int l, int c) {

    }

    public int size() {
        return size;
    }

    public int getCase(int l, int c) {
        return this.nombre.get(c + l * this.size());
    }

    public int getNbGagnees() {
        return nbGagnee;
    }

    public int getNbJouees() {
        return nbJouee;
    }

    public void setTaille(int taille) {
        this.size = taille;
        this.nouveau();
        this.notifierObservateurs();
    }

    public void setObjectif(int objectif) {
        this.objectif = objectif;
    }

    public void nouveauNombre(int l, int c) {
        Random r = new Random();
        int nb = (int) Math.pow(2, r.nextInt(3) + 1);

        this.nombre.set(c + l * this.size(), nb);
    }

    public void doublement(int l, int c){
        this.nombre.set(c + l * this.size(), this.nombre.get(c + l * this.size()) * 2);
        this.notifierObservateurs();
    }
}
