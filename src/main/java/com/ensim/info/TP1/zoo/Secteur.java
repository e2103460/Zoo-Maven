package com.ensim.info.TP1.zoo;

import com.ensim.info.TP1.utils.TypeAnimal;

import java.util.List;

public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur;
    private List<Animal> animauxDansSecteur;

    public Secteur(TypeAnimal t1) {
        this.typeAnimauxDansSecteur = t1;
    }

    public void ajouterAnimal(Animal a1){ animauxDansSecteur.add(a1); }
    public int getNombreAnimaux() { return animauxDansSecteur.size(); }
    public TypeAnimal obtenirType() { return typeAnimauxDansSecteur; }

}
