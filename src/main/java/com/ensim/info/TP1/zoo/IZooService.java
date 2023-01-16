package com.ensim.info.TP1.zoo;

import com.ensim.info.TP1.exception.LimiteVisiteurException;
import com.ensim.info.TP1.utils.TypeAnimal;

import java.util.List;

public interface IZooService {

    void ajouterSecteur(TypeAnimal a);
    public void nouveauVisiteur() throws LimiteVisiteurException;
    public int getLimiteVisiteur();
    public void nouvelAnimal(Animal a);
    public int nombreAnimaux();
    public int getVisiteurs();

}
