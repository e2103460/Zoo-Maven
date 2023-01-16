package com.ensim.info.TP1.zoo;

import com.ensim.info.TP1.utils.TypeAnimal;

public class Chien extends Animal {

    public Chien(String name) {
        super(name);
        this.typeAnimal = TypeAnimal.CHIEN;
    }

    @Override
    public String getNomAnimal() {
        return super.getNomAnimal();
    }
}
