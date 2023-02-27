package com.example.repository.impl;

import com.example.entity.Personnage;
import com.example.repository.PersonnageRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implémentation de l'interface {@link PersonnageRepository}.
 * @author BBE
 * @version 1.0
 * @since 1.0
 * @see PersonnageRepository
 */
public class PersonnageRepositoryImpl implements PersonnageRepository {

    private static Map<Integer, Personnage> personnages = new HashMap<>();
    private static int nextId = 1;

    @Override
    public List<Personnage> findAll() {
        return new ArrayList<>(personnages.values());
    }

    @Override
    public Personnage findById(int id) {
        return personnages.get(id);
    }

    @Override
    public void add(Personnage personnage) {
        personnages.put(nextId, personnage);
        nextId++;
    }

    @Override
    public void update(Personnage personnage) {
        personnage.setId(nextId);
        personnages.put(nextId, personnage);

    }

    @Override
    public void delete(int personnage) {
        personnages.remove(personnage);
    }
}
