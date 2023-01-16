package com.ensim.info.TP1.zoo;

import com.ensim.info.TP1.exception.AnimalDansMauvaisSecteurException;
import com.ensim.info.TP1.exception.LimiteVisiteurException;
import com.ensim.info.TP1.utils.TypeAnimal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int visiteurs = 0;
    private List<Secteur> secteurAnimaux;
    private int nbVisiteursMaxParSecteur = 10;



    public Zoo(){
        secteurAnimaux = new ArrayList<Secteur>();
        secteurAnimaux.add(new Secteur(TypeAnimal.CHAT));
        secteurAnimaux.add(new Secteur(TypeAnimal.CHIEN));
    }

    public void ajouterSecteur(TypeAnimal a) {
        secteurAnimaux.add(new Secteur(a));
    }

    public void nouveauVisiteur() throws LimiteVisiteurException {
        if(visiteurs >= nbVisiteursMaxParSecteur*secteurAnimaux.size())
            throw new LimiteVisiteurException();

        else
            this.visiteurs++;
    }

    public int getLimiteVisiteur() { return this.nbVisiteursMaxParSecteur; }

    public void nouvelAnimal(Animal a){
        for(int i = 0 ; i < secteurAnimaux.size() ; i ++)
        {
            if(a.getTypeAnimal() == secteurAnimaux.get(i).obtenirType())
                secteurAnimaux.get(i).ajouterAnimal(a);
        }
    }

    public int nombreAnimaux() {
        int nbAnimaux = 0;

        for (int i = 0 ; i < secteurAnimaux.size() ; i ++)
            nbAnimaux += secteurAnimaux.get(i).getNombreAnimaux();

        return nbAnimaux;

    }

    public void setMaxVisiteurParSecteur(int i) {
        this.nbVisiteursMaxParSecteur = i;
    }
}
