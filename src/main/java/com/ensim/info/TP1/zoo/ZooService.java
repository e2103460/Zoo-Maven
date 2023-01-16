package com.ensim.info.TP1.zoo;

import com.ensim.info.TP1.exception.LimiteVisiteurException;
import com.ensim.info.TP1.utils.TypeAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ZooService implements IZooService{

    @Autowired
    IZooDao zooDao;

    public IZooDao getZooDao() {
        return zooDao;
    }

    public void setZooDao(IZooDao zooDao) {
        this.zooDao = zooDao;
    }

    @Override
    public void ajouterSecteur(TypeAnimal a) {
        zooDao.ajouterSecteur(a);
    }

    @Override
    public void nouveauVisiteur() throws LimiteVisiteurException {
        zooDao.nouveauVisiteur();
    }

    @Override
    public int getLimiteVisiteur() {
        return zooDao.getLimiteVisiteur();
    }

    @Override
    public void nouvelAnimal(Animal a) {
        zooDao.nouvelAnimal(a);
    }

    @Override
    public int nombreAnimaux() {
        return zooDao.nombreAnimaux();
    }

    public int getVisiteurs() {
        return zooDao.getVisiteurs();
    }
}
