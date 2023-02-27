package com.example.service;

import com.example.entity.Personnage;
import com.example.repository.PersonnageRepository;

import java.util.List;

public interface PersonnageService {
    public List<Personnage> getAll();

    public Personnage getById(int id);

    public default void add(Personnage personnage) {}

    public default void update(Personnage personnage) {}

    public default void delete(int id) {}
}
