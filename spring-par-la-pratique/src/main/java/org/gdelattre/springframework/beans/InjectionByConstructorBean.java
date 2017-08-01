package org.gdelattre.springframework.beans;

/**
 * Constructor Dependency Injection.
 */
public class InjectionByConstructorBean {

    private String chaine;

    private int entier;

    public InjectionByConstructorBean(String chaine, int entier) {
        this.chaine = chaine;
        this.entier = entier;
    }

    public String getChaine() {
        return chaine;
    }

    public int getEntier() {
        return entier;
    }
}