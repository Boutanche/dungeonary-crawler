package com.example.entity;

/**
 * Interface de base pour les entités de type Personnage.
 * @author BBE
 * @version 1.0
 * @since 1.0
 */
public interface Personnage {

        /**
        * Retourne l'identifiant du personnage.
        * @return l'identifiant du personnage.
        */
        int getId();

        /**
        * Retourne le surnom du personnage.
        * @return le surnom du personnage.
        */
        String getSurnom();

        /**
        * Modifie le surnom du personnage.
        * @param surnom le nouveau surnom du personnage.
        */
        void setSurnom(String surnom);

        /**
         * Modifie l'identifiant du personnage.
         * @param nextId
         */
        void setId(int nextId);
}
