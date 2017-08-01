package org.gdelattre.springframework.beans;

/**
 * Created by guillaume on 01/08/17.
 */
public class InjectionByModifierBean {

    private String chaine;

    private int entier;

    public String getChaine() {
        return chaine;
    }

    public void setChaine(String chaine) {
        this.chaine = chaine;
    }

    public int getEntier() {
        return entier;
    }

    public void setEntier(int entier) {
        this.entier = entier;
    }
}
