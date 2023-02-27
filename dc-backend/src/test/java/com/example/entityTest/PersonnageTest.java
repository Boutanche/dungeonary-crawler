package com.example.entityTest;

import com.example.entity.Personnage;
import com.example.entity.impl.PersonnageImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonnageTest {
    /**
     * Test de la méthode getId().
     */
    @Test
    public void testGetId_estOk() {
        Personnage personnage = new PersonnageImpl("Boutanche");
        personnage.setId(1);
        assertEquals(1, personnage.getId());
    }
    /**
     * Test de la méthode getSurnom().
     */
    @Test
    public void testGetSurnom_estOk() {
        Personnage personnage = new PersonnageImpl("Boutanche");
        assertEquals("Boutanche", personnage.getSurnom());
    }
}
