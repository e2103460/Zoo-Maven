package com.ensim.info.TP1.exception;

public class AnimalDansMauvaisSecteurException extends Exception{
    public AnimalDansMauvaisSecteurException(){
        System.out.println("Cet animal ne peut pas aller dans ce secteur !");
    }
}
