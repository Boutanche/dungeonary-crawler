package com.example.repository;

import com.example.entity.Personnage;

import java.util.List;

/**
 * PersonnageRepository
 * author BBE
 * version 1.0
 * since 1.0
 * @see Personnage
 */
public interface PersonnageRepository {
    /**
     * Retourne la liste de tous les personnages.
     * @return la liste de tous les personnages.
     */
    public List<Personnage> findAll();
    /**
     * Retourne le personnage correspondant à l'identifiant.
     * @param id l'identifiant du personnage.
     * @return le personnage correspondant à l'identifiant.
     */
    public Personnage findById(int id);
    /**
     * Ajoute un personnage.
     * @param personnage le personnage à ajouter.
     */
    public void add(Personnage personnage);
    /**
     * Met à jour un personnage.
     * @param personnage le personnage à mettre à jour.
     */
    public void update(Personnage personnage);
    /**
     * Supprime un personnage.
     * @param personnage le personnage à supprimer.
     */
    public void delete(int personnage);
}
