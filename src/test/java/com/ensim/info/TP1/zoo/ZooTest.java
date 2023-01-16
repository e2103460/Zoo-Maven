package com.ensim.info.TP1.zoo;

import com.ensim.info.TP1.exception.AnimalDansMauvaisSecteurException;
import com.ensim.info.TP1.exception.LimiteVisiteurException;
import com.ensim.info.TP1.utils.TypeAnimal;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    static Zoo zoo;
    static Chien michel;
    static Chat henri;

    @BeforeAll
    public static void initTest(){
        zoo = new Zoo();
    }

    @Test
    void nouveauVisiteur() throws LimiteVisiteurException {
        for (int i = 0 ; i < 20 ; i ++) {
            zoo.nouveauVisiteur();
        }
        Exception e = assertThrows(LimiteVisiteurException.class, () ->{
            zoo.nouveauVisiteur();
        });
        assertEquals("Trop de visiteurs dans ce secteur", e.getMessage(), "Message d'erreur OK");
    }

    @Test
    void nouvelAnimal() {

    }
}