package com.example.entity.impl;

import com.example.entity.Personnage;

/**
 * Classe implémentant l'interface Personnage.
 * Cette classe est utilisée pour la gestion des personnages.
 * @author BBE
 * @version 1.0
 * @since 1.0
 * @see Personnage
 */
public class PersonnageImpl implements Personnage {

    /**
     * Identifiant du personnage.
     */
    private int id;
    /**
     * Surnom du personnage.
     */
    private String surnom;

    /**
     * Constructeur par défaut.
     */
    public PersonnageImpl(String surnom) {
        super();
        this.surnom = surnom;
    }

    /**
     * getter de l'identifiant du personnage.
     * @return
     */
    @Override
    public int getId() {
        return this.id;
    }

    /**
     * getter du surnom du personnage.
     * @return le surnom du personnage.
     */
    @Override
    public String getSurnom() {
        return this.surnom;
    }

    /**
     * setter du surnom du personnage.
     * @param surnom le nouveau surnom du personnage.
     */
    @Override
    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }

    /**
     * setter de l'identifiant du personnage.
     * @param nextId l'identifiant du personnage.
     */
    @Override
    public void setId(int nextId) {
        this.id = nextId;
    }
}
