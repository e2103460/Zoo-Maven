package com.ensim.info.TP1.zoo;

import com.ensim.info.TP1.utils.TypeAnimal;

public class Animal {
    protected String nomAnimal;
    protected TypeAnimal typeAnimal;

    public Animal(String name) {
        this.nomAnimal = name;
    }
    public String getNomAnimal() { return nomAnimal; }
    public TypeAnimal getTypeAnimal() { return typeAnimal; }
}
