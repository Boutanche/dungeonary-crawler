package com.example.controllerTest;
import com.example.controller.impl.PersonnageControllerImpl;
import com.example.entity.Personnage;
import com.example.entity.impl.PersonnageImpl;
import com.example.repository.PersonnageRepository;
import com.example.repository.impl.PersonnageRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class PersonnageControllerImplTest {
    private PersonnageControllerImpl personnageController;

    @Mock
    private PersonnageRepositoryImpl personnageRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        personnageController = new PersonnageControllerImpl(personnageRepository);
    }

    @Test
    void testFindAll() {
        Personnage personnage1 = new PersonnageImpl("Personnage 1");
        Personnage personnage2 = new PersonnageImpl("Personnage 2");
        personnage1.setId(1);
        personnage2.setId(2);

        List<Personnage> personnages = Arrays.asList(personnage1, personnage2);

        when(personnageRepository.findAll()).thenReturn(personnages);

        Response response = personnageController.findAll();

        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(personnages, response.getEntity());
    }

    @Test
    void testFindById() {
        Personnage personnage = new PersonnageImpl("Personnage 1");
        personnage.setId(1);

        when(personnageRepository.findById(1)).thenReturn(personnage);

        Personnage result = personnageController.findById(1);
        assertEquals(personnage, result);
    }

}