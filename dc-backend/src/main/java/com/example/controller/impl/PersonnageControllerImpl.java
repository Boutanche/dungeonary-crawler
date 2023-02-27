package com.example.controller.impl;

import com.example.controller.PersonnageController;
import com.example.entity.Personnage;
import com.example.repository.PersonnageRepository;
import com.example.repository.impl.PersonnageRepositoryImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Controller de Personnage
 * @author BBE
 * @version 1.0
 * @created 01-mai-2020 15:00:00
 */
@Path("/personnages")
public class PersonnageControllerImpl implements PersonnageController {
    private final PersonnageRepository personnageRepository = new PersonnageRepositoryImpl();

    public PersonnageControllerImpl(PersonnageRepositoryImpl personnageRepository) {
    }

    @Override
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        List<Personnage> personnages = personnageRepository.findAll();
        return Response.ok(personnages).build();
    }

    @Override
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Personnage findById(@PathParam("id") int id) {
        Personnage personnage = personnageRepository.findById(id);
        return personnageRepository.findById(id);
    }

    @Override
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Personnage personnage) {
        personnageRepository.add(personnage);
        return Response.ok().build();
    }

    @Override
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Personnage personnage) {
        personnageRepository.update(personnage);
        return Response.ok().build();
    }
}
