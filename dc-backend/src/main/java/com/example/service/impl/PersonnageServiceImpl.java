package com.example.service.impl;

import com.example.entity.Personnage;
import com.example.repository.PersonnageRepository;
import com.example.repository.impl.PersonnageRepositoryImpl;
import com.example.service.PersonnageService;

import java.util.List;

public class PersonnageServiceImpl implements PersonnageService {
    private final PersonnageRepository personnageRepository = new PersonnageRepositoryImpl();
    @Override
    public List<Personnage> getAll() {
        return personnageRepository.findAll();
    }

    @Override
    public Personnage getById(int id) {
        return personnageRepository.findById(id);
    }

    @Override
    public void add(Personnage personnage) {
        personnageRepository.add(personnage);
    }

    @Override
    public void update(Personnage personnage) {
        personnageRepository.update(personnage);
    }

    @Override
    public void delete(int id) {
        personnageRepository.delete(id);
    }
}
