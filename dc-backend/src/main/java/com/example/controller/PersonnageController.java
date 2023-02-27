package com.example.controller;

import com.example.entity.Personnage;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Interface de base pour les controllers de type Personnage.
 * @author BBE
 * @version 1.0
 * @since 1.0
 */
public interface PersonnageController {

    /**
     * Retourne la liste de tous les personnages.
     * @return la liste de tous les personnages.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Response findAll();

    /**
     * Retourne le personnage correspondant à l'identifiant.
     * @param id l'identifiant du personnage.
     * @return le personnage correspondant à l'identifiant.
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    Personnage findById(@PathParam("id") int id);

    /**
     * Ajoute un personnage.
     * @param personnage le personnage à ajouter.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    Response add(Personnage personnage);

    /**
     * Met à jour un personnage.
     * @param personnage le personnage à mettre à jour.
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    Response update(Personnage personnage);
}
